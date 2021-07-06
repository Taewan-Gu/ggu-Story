<template>
  <div class="home">
    나를 표현하다.
    저를 표현할 웹 사이트를 만들었습니다.
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'Home',
  created() {
    localStorage.setItem("select", 0)
  },
}
</script>
