import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/portpolio',
    name: 'Portpolio',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Portpolio.vue')
  },
  {
    path: '/planner',
    name: 'Planner',
    component: () => import('../views/Planner.vue')
  },
  {
    path: '/planner/todo',
    name: 'TodoList',
    component: () => import('../views/planner/TodoList.vue')
  },
  {
    path: '/mission',
    name: 'Mission',
    component: () => import('../views/Mission.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
