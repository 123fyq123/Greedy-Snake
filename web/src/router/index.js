import { createRouter, createWebHashHistory } from 'vue-router'
import PkIndexView from "../views/pk/PkIndexView"
import RecordIndexView from "../views/record/RecordIndexView"
import RankListIndexView from "../views/ranklist/RankListIndexView"
import UserBotIndexView from "../views/user/bots/UserBotIndexView"
import NotFound from "../views/error/NotFound"

const routes = [
  {
    path: '/',
    name: "home",
    redirect: "/pk/",
  },
  {
    path: "/pk/",
    component: PkIndexView,
    name: "pk_index"
  },
  {
    path: "/ranklist/",
    component: RankListIndexView,
    name: "ranklist_index"
  },
  {
    path: "/record/",
    component: RecordIndexView,
    name: "record_index"
  },
  {
    path: "/user/bot/",
    component: UserBotIndexView,
    name: "userbot_index"
  },
  {
    path: "/404/",
    component: NotFound,
    name: "404",
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
