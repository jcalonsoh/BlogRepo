package com.nisum.blog.persistance;

import java.util.ArrayList;

import com.nisum.blog.model.Comment;
import com.nisum.blog.model.News;

public interface INewsRepository {

	News create(News miNoticiaAGuardar) throws RuntimeException;

	News delete(int i) throws RuntimeException;

	boolean isEmpty();

	News read(int i) throws RuntimeException;

	ArrayList<News> readAll();

	Comment addComment(int id, Comment nuevoComentario) throws RuntimeException;

	News searchNewsbyTag(int id, String tag);

}