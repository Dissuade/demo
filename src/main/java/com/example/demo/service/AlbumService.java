package com.example.demo.service;

import com.example.demo.model.Album;
import com.example.demo.repoistery.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepo albumRepo;
    public Album getAlbum() {
        return albumRepo.getAlbum();
    }

    public Album saveAlbum(Album album)
    {

        return albumRepo.saveAlbum(album);
    }

    public List<Album> getAllAlbum() {
        return albumRepo.getAllAlbum();
    }

    public Album getAlbumById(int albumId) {

        return albumRepo.getAlbumById(albumId);

    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepo.updateAlbum(albumId,album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepo.deleteAlbum(albumId);
    }
}
