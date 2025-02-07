/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film application stages service. This utility wraps <code>com.nbp.film.stages.services.service.persistence.impl.FilmApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStagesPersistence
 * @generated
 */
public class FilmApplicationStagesUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FilmApplicationStages filmApplicationStages) {
		getPersistence().clearCache(filmApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, FilmApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmApplicationStages update(
		FilmApplicationStages filmApplicationStages) {

		return getPersistence().update(filmApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmApplicationStages update(
		FilmApplicationStages filmApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(filmApplicationStages, serviceContext);
	}

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_CAI(long filmApplicationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_CAI(filmApplicationId);
	}

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CAI(
		long filmApplicationId) {

		return getPersistence().fetchBygetFAS_CAI(filmApplicationId);
	}

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CAI(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CAI(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film application stages where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application stages that was removed
	 */
	public static FilmApplicationStages removeBygetFAS_CAI(
			long filmApplicationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().removeBygetFAS_CAI(filmApplicationId);
	}

	/**
	 * Returns the number of film application stageses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application stageses
	 */
	public static int countBygetFAS_CAI(long filmApplicationId) {
		return getPersistence().countBygetFAS_CAI(filmApplicationId);
	}

	/**
	 * Returns all the film application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName) {

		return getPersistence().findBygetFAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the film application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetFAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().findBygetFAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_StageName_First(
			String stageName,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_StageName_First(
		String stageName,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_StageName_Last(
			String stageName,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_StageName_Last(
		String stageName,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages[] findBygetFAS_StageName_PrevAndNext(
			long filmApplicationStagesId, String stageName,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_PrevAndNext(
			filmApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the film application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetFAS_StageName(String stageName) {
		getPersistence().removeBygetFAS_StageName(stageName);
	}

	/**
	 * Returns the number of film application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching film application stageses
	 */
	public static int countBygetFAS_StageName(String stageName) {
		return getPersistence().countBygetFAS_StageName(stageName);
	}

	/**
	 * Returns all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stageses
	 */
	public static List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus) {

		return getPersistence().findBygetFAS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of matching film application stageses
	 */
	public static List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film application stageses
	 */
	public static List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film application stageses
	 */
	public static List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<FilmApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages
			findBygetFAS_StageName_StageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_StageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages
		fetchBygetFAS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_StageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_StageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages
		fetchBygetFAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_StageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages[]
			findBygetFAS_StageName_StageStatus_PrevAndNext(
				long filmApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_StageStatus_PrevAndNext(
			filmApplicationStagesId, stageName, stageStatus, orderByComparator);
	}

	/**
	 * Removes all the film application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		getPersistence().removeBygetFAS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	public static int countBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		return getPersistence().countBygetFAS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetFAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the film application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the film application stages that was removed
	 */
	public static FilmApplicationStages removeBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().removeBygetFAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching film application stageses
	 */
	public static int countBygetFAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetFAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the film application stages that was removed
	 */
	public static FilmApplicationStages removeBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().removeBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	public static int countBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the film application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the film application stages that was removed
	 */
	public static FilmApplicationStages removeBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().removeBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	public static int countBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the film application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId) {

		return getPersistence().findBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the film application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the film application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film application stageses
	 */
	public static List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public static FilmApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public static FilmApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long filmApplicationStagesId, String caseId,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_PrevAndNext(
			filmApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the film application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCAS_CaseId(String caseId) {
		getPersistence().removeBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film application stageses
	 */
	public static int countBygetCAS_CaseId(String caseId) {
		return getPersistence().countBygetCAS_CaseId(caseId);
	}

	/**
	 * Caches the film application stages in the entity cache if it is enabled.
	 *
	 * @param filmApplicationStages the film application stages
	 */
	public static void cacheResult(
		FilmApplicationStages filmApplicationStages) {

		getPersistence().cacheResult(filmApplicationStages);
	}

	/**
	 * Caches the film application stageses in the entity cache if it is enabled.
	 *
	 * @param filmApplicationStageses the film application stageses
	 */
	public static void cacheResult(
		List<FilmApplicationStages> filmApplicationStageses) {

		getPersistence().cacheResult(filmApplicationStageses);
	}

	/**
	 * Creates a new film application stages with the primary key. Does not add the film application stages to the database.
	 *
	 * @param filmApplicationStagesId the primary key for the new film application stages
	 * @return the new film application stages
	 */
	public static FilmApplicationStages create(long filmApplicationStagesId) {
		return getPersistence().create(filmApplicationStagesId);
	}

	/**
	 * Removes the film application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages that was removed
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages remove(long filmApplicationStagesId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().remove(filmApplicationStagesId);
	}

	public static FilmApplicationStages updateImpl(
		FilmApplicationStages filmApplicationStages) {

		return getPersistence().updateImpl(filmApplicationStages);
	}

	/**
	 * Returns the film application stages with the primary key or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages findByPrimaryKey(
			long filmApplicationStagesId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationStagesException {

		return getPersistence().findByPrimaryKey(filmApplicationStagesId);
	}

	/**
	 * Returns the film application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages, or <code>null</code> if a film application stages with the primary key could not be found
	 */
	public static FilmApplicationStages fetchByPrimaryKey(
		long filmApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(filmApplicationStagesId);
	}

	/**
	 * Returns all the film application stageses.
	 *
	 * @return the film application stageses
	 */
	public static List<FilmApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of film application stageses
	 */
	public static List<FilmApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application stageses
	 */
	public static List<FilmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application stageses
	 */
	public static List<FilmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film application stageses.
	 *
	 * @return the number of film application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmApplicationStagesPersistence _persistence;

}