import { ApiProperty } from '@nestjs/swagger';
import { Entity, Column, PrimaryGeneratedColumn } from 'typeorm';

@Entity()
export class Word {
  @PrimaryGeneratedColumn('increment')
  id: number;

  @Column('text')
  @ApiProperty()
  word: string;

  @Column('text')
  @ApiProperty()
  reference: string;

  @Column('boolean')
  @ApiProperty()
  isOpen: boolean;
}
