const DEV_BASE_URL = "http://localhost:8080/"
// const PRD_BASE_URL = "https://www.ggustory.site/api/"
const BASE_URL = DEV_BASE_URL

export default {
  URL: {
    planner: {
      period_new: BASE_URL + "period/new",
      period_all: BASE_URL + "period/all",
      plan_new: BASE_URL + "plan/new",
      plan_get: BASE_URL + "plan/get",
      plan_all: BASE_URL + "plan/all",
      todo_new: BASE_URL + "todo/new",
      todo_get: BASE_URL + "todo/get",
      todo_all: BASE_URL + "todo/all",
    },
  },
}