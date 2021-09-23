export function setTextMode (state, textMode) {
  state.textMode = textMode
}

export function setCategoryMode (state, categoryMode) {
    state.categoryMode = categoryMode
}

export function setLoginUser (state, loginUser) {
  state.loginUser = loginUser
}

export function setInfos (state, info) {
  state.user_info = info
}

export function setHashtags (state, hashtags,hashString) {
  state.loginUser.hashtag = hashString
  state.hash_tags = hashtags
}
export function setHashscore (state, score) {
  state.user_info.hashScore = score
}

export function setBookList (state, bookList) {
  state.bookList = bookList
}

export function setSelectBook (state, selectBook) {
  state.selectBook = selectBook
}