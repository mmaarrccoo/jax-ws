package meinefirma.meinprojekt.ws;

/** Exception, falls Create mit vorhandener ISBN versucht wird */
public class DuplicateCreateException extends Exception
{
   private static final long serialVersionUID = 1L;

   // (der dummy-Parameter wird erst spaeter benoetigt)
   public DuplicateCreateException( String err, Object dummy )
   {
      super( err );
   }
}
