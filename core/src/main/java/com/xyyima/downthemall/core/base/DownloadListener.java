package com.xyyima.downthemall.core.base;

/**
 * @author tonywang
 *         created on 2020/5/5.
 */
public interface DownloadListener {

    void onProcess(Downloader downloader, int process);

    void onStart(Downloader downloader);

    void onPause(Downloader downloader);

    void onTerminate(Downloader downloader);

    void onFinish(Downloader downloader);

    void onError(Downloader downloader,DownloadError downloadError);

}
