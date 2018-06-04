package corp;

import java.util.Objects;

public class UserPOJO {
  private String name;
  private String uuid;
  private String hello;

  public UserPOJO() {
  }

  public UserPOJO(String name, String uuid, String hello) {
    this.name = name;
    this.uuid = uuid;
    this.hello = hello;
  }

  @Override
  public String toString() {
    return "corp.UserPOJO{" +
            "name='" + name + '\'' +
            ", uuid='" + uuid + '\'' +
            ", hello='" + hello + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserPOJO userPOJO = (UserPOJO) o;
    return Objects.equals(name, userPOJO.name) &&
            Objects.equals(uuid, userPOJO.uuid) &&
            Objects.equals(hello, userPOJO.hello);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, hello);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getHello() {
    return hello;
  }

  public void setHello(String hello) {
    this.hello = hello;
  }
}
