# -
MediaPlayer

# 注意： 虚拟机SDK要用28

#播放音频准确路径：
```
            AssetManager assetManager=getResources().getAssets();
            AssetFileDescriptor fileDescriptor=assetManager.openFd("music.mp3");
            mediaPlayer.setDataSource(fileDescriptor.getFileDescriptor(),fileDescriptor.getStartOffset(),fileDescriptor.getLength());
            mediaPlayer.prepare();
```

#播放视频准确路径：
```
         String path="android.resource://"+getPackageName()+"/"+R.raw.movie;
         videoView.setVideoPath(path);
```
