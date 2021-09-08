import { Controller, Get, Post, Body, Param, Delete } from '@nestjs/common';
import { ApiResponse, ApiTags } from '@nestjs/swagger';
import { Word } from './entities/word.entity';
import { WordsService } from './words.service';

@ApiTags('words')
@Controller('words')
export class WordsController {
  constructor(private readonly wordsService: WordsService) {}

  @Get()
  @ApiResponse({ status: 200, description: 'finded successfully' })
  async findAll() {
    let words = [];
    await this.wordsService.findAll().then((value) => {
      words = value;
    });
    return {
      data: words,
      statusCode: 200,
      statusMsg: `finded successfully`,
    };
  }

  @Post()
  @ApiResponse({ status: 201, description: 'saved successfully' })
  @ApiResponse({ status: 400, description: 'Wrong WordSchema.' })
  async create(@Body() word: Word) {
    this.wordsService.save(word);
    return {
      data: { ...word },
      statusCode: 201,
      statusMsg: `saved successfully`,
    };
  }

  @Delete(':id')
  @ApiResponse({ status: 200, description: 'deleted successfully' })
  @ApiResponse({ status: 400, description: 'Wrong Id.' })
  async remove(@Param('id') id: string) {
    this.wordsService.delete(id);
    return {
      data: id,
      statusCode: 200,
      statusMsg: `deleted successfully`,
    };
  }
}
