/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.stages.services.exception.NoSuchFilmApplicationStagesException;
import com.nbp.film.stages.services.model.FilmApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface FilmApplicationStagesPersistence
	extends BasePersistence<FilmApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmApplicationStagesUtil} to access the film application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_CAI(long filmApplicationId)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CAI(long filmApplicationId);

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CAI(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film application stages where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application stages that was removed
	 */
	public FilmApplicationStages removeBygetFAS_CAI(long filmApplicationId)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the number of film application stageses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application stageses
	 */
	public int countBygetFAS_CAI(long filmApplicationId);

	/**
	 * Returns all the film application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching film application stageses
	 */
	public java.util.List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName);

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
	public java.util.List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end);

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
	public java.util.List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

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
	public java.util.List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public FilmApplicationStages[] findBygetFAS_StageName_PrevAndNext(
			long filmApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Removes all the film application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetFAS_StageName(String stageName);

	/**
	 * Returns the number of film application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching film application stageses
	 */
	public int countBygetFAS_StageName(String stageName);

	/**
	 * Returns all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stageses
	 */
	public java.util.List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus);

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
	public java.util.List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end);

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
	public java.util.List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator);

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
	public java.util.List<FilmApplicationStages>
		findBygetFAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_StageName_StageStatus_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_StageName_StageStatus_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

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
	public FilmApplicationStages[]
			findBygetFAS_StageName_StageStatus_PrevAndNext(
				long filmApplicationStagesId, String stageName,
				String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Removes all the film application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the number of film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	public int countBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the film application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the film application stages that was removed
	 */
	public FilmApplicationStages removeBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching film application stageses
	 */
	public int countBygetFAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the film application stages that was removed
	 */
	public FilmApplicationStages removeBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	public int countBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the film application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the film application stages that was removed
	 */
	public FilmApplicationStages removeBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	public int countBygetFAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the film application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching film application stageses
	 */
	public java.util.List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId);

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
	public java.util.List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end);

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
	public java.util.List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

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
	public java.util.List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the first film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	public FilmApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the last film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	public FilmApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public FilmApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long filmApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Removes all the film application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCAS_CaseId(String caseId);

	/**
	 * Returns the number of film application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film application stageses
	 */
	public int countBygetCAS_CaseId(String caseId);

	/**
	 * Caches the film application stages in the entity cache if it is enabled.
	 *
	 * @param filmApplicationStages the film application stages
	 */
	public void cacheResult(FilmApplicationStages filmApplicationStages);

	/**
	 * Caches the film application stageses in the entity cache if it is enabled.
	 *
	 * @param filmApplicationStageses the film application stageses
	 */
	public void cacheResult(
		java.util.List<FilmApplicationStages> filmApplicationStageses);

	/**
	 * Creates a new film application stages with the primary key. Does not add the film application stages to the database.
	 *
	 * @param filmApplicationStagesId the primary key for the new film application stages
	 * @return the new film application stages
	 */
	public FilmApplicationStages create(long filmApplicationStagesId);

	/**
	 * Removes the film application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages that was removed
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public FilmApplicationStages remove(long filmApplicationStagesId)
		throws NoSuchFilmApplicationStagesException;

	public FilmApplicationStages updateImpl(
		FilmApplicationStages filmApplicationStages);

	/**
	 * Returns the film application stages with the primary key or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	public FilmApplicationStages findByPrimaryKey(long filmApplicationStagesId)
		throws NoSuchFilmApplicationStagesException;

	/**
	 * Returns the film application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages, or <code>null</code> if a film application stages with the primary key could not be found
	 */
	public FilmApplicationStages fetchByPrimaryKey(
		long filmApplicationStagesId);

	/**
	 * Returns all the film application stageses.
	 *
	 * @return the film application stageses
	 */
	public java.util.List<FilmApplicationStages> findAll();

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
	public java.util.List<FilmApplicationStages> findAll(int start, int end);

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
	public java.util.List<FilmApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator);

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
	public java.util.List<FilmApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film application stageses.
	 *
	 * @return the number of film application stageses
	 */
	public int countAll();

}