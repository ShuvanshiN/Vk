package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Like like;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostType postType;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private boolean postponedId;

}
