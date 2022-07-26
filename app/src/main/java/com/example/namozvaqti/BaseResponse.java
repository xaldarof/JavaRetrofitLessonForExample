package com.example.namozvaqti;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Temur
 * @Date: 26/07/2022
 */

public class BaseResponse {
    @SerializedName("total_count")
    int totalCount;
    @SerializedName("incomplete_results")
    boolean incompleteResults;
    List<GithubUser> items;


    public BaseResponse(int totalCount, boolean incompleteResults, List<GithubUser> items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }
}

class GithubUser {
    String login;
    @SerializedName("avatar_url")
    String avatarUrl;

    public GithubUser(String login, String avatarUrl) {
        this.login = login;
        this.avatarUrl = avatarUrl;
    }
}
