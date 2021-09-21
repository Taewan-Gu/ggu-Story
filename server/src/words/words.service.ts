import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Word } from './entities/word.entity';

@Injectable()
export class WordsService {
  constructor(
    @InjectRepository(Word)
    private wordsRepository: Repository<Word>,
  ) {}

  async findAll(): Promise<Word[]> {
    return this.wordsRepository.find();
  }

  async save(word: Word): Promise<void> {
    this.wordsRepository.save(word);
  }

  async delete(id: string): Promise<void> {
    this.wordsRepository.delete(id);
  }
}
