package cz.msebera.android.httpclient.impl.client;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RedirectLocations extends AbstractList<Object> {
   private final List<URI> all = new ArrayList();
   private final Set<URI> unique = new HashSet();

   public void add(int var1, Object var2) {
      this.all.add(var1, (URI)var2);
      this.unique.add((URI)var2);
   }

   public void add(URI var1) {
      this.unique.add(var1);
      this.all.add(var1);
   }

   public boolean contains(Object var1) {
      return this.unique.contains(var1);
   }

   public boolean contains(URI var1) {
      return this.unique.contains(var1);
   }

   public URI get(int var1) {
      return (URI)this.all.get(var1);
   }

   public URI remove(int var1) {
      URI var2 = (URI)this.all.remove(var1);
      this.unique.remove(var2);
      if(this.all.size() != this.unique.size()) {
         this.unique.addAll(this.all);
      }

      return var2;
   }

   public Object set(int var1, Object var2) {
      URI var3 = (URI)this.all.set(var1, (URI)var2);
      this.unique.remove(var3);
      this.unique.add((URI)var2);
      if(this.all.size() != this.unique.size()) {
         this.unique.addAll(this.all);
      }

      return var3;
   }

   public int size() {
      return this.all.size();
   }
}
