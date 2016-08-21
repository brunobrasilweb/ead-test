ALTER TABLE public.courses ALTER COLUMN video TYPE text USING video::text;

ALTER TABLE public.courses ALTER COLUMN video SET NOT NULL;

ALTER TABLE public.courses ALTER COLUMN video DROP DEFAULT;
ALTER TABLE public.courses ALTER COLUMN img TYPE text USING img::text;

ALTER TABLE public.courses ALTER COLUMN img DROP NOT NULL;

ALTER TABLE public.courses ALTER COLUMN img DROP DEFAULT;
