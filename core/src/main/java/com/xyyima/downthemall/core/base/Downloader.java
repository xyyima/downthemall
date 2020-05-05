package com.xyyima.downthemall.core.base;

/**
 * @author tonywang
 */
public interface Downloader extends Component {

    boolean init(DownloadConfig config);

    boolean reload(DownloadConfig config);

    boolean isSupport(Content content);

    boolean start();

    boolean pause();

    boolean resume();

    boolean terminate();

    boolean clear();

    boolean addListener(DownloadListener listener);
}
