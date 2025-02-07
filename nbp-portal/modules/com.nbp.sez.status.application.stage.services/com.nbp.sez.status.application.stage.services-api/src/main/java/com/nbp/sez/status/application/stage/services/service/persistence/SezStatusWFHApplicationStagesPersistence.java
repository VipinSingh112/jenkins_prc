/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusWFHApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status wfh application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface SezStatusWFHApplicationStagesPersistence
	extends BasePersistence<SezStatusWFHApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusWFHApplicationStagesUtil} to access the sez status wfh application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId);

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez status wfh application stages where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status wfh application stages that was removed
	 */
	public SezStatusWFHApplicationStages removeBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the number of sez status wfh application stageses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfh application stageses
	 */
	public int countBygetSAS_SAI(long sezStatusApplicationId);

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the sez status wfh application stages that was removed
	 */
	public SezStatusWFHApplicationStages removeBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching sez status wfh application stageses
	 */
	public int countBygetSAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName);

	/**
	 * Returns a range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the first sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns the last sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the last sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns the sez status wfh application stageses before and after the current sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param sezWFHAppStagesId the primary key of the current sez status wfh application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public SezStatusWFHApplicationStages[] findBygetSAS_StageName_PrevAndNext(
			long sezWFHAppStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Removes all the sez status wfh application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetSAS_StageName(String stageName);

	/**
	 * Returns the number of sez status wfh application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching sez status wfh application stageses
	 */
	public int countBygetSAS_StageName(String stageName);

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the sez status wfh application stages that was removed
	 */
	public SezStatusWFHApplicationStages removeBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching sez status wfh application stageses
	 */
	public int countBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the sez status wfh application stages that was removed
	 */
	public SezStatusWFHApplicationStages removeBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching sez status wfh application stageses
	 */
	public int countBygetSAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the first sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns the last sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages findBygetSAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the last sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns the sez status wfh application stageses before and after the current sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param sezWFHAppStagesId the primary key of the current sez status wfh application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public SezStatusWFHApplicationStages[] findBygetSAS_CaseId_PrevAndNext(
			long sezWFHAppStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Removes all the sez status wfh application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetSAS_CaseId(String caseId);

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status wfh application stageses
	 */
	public int countBygetSAS_CaseId(String caseId);

	/**
	 * Caches the sez status wfh application stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 */
	public void cacheResult(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages);

	/**
	 * Caches the sez status wfh application stageses in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFHApplicationStageses the sez status wfh application stageses
	 */
	public void cacheResult(
		java.util.List<SezStatusWFHApplicationStages>
			sezStatusWFHApplicationStageses);

	/**
	 * Creates a new sez status wfh application stages with the primary key. Does not add the sez status wfh application stages to the database.
	 *
	 * @param sezWFHAppStagesId the primary key for the new sez status wfh application stages
	 * @return the new sez status wfh application stages
	 */
	public SezStatusWFHApplicationStages create(long sezWFHAppStagesId);

	/**
	 * Removes the sez status wfh application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public SezStatusWFHApplicationStages remove(long sezWFHAppStagesId)
		throws NoSuchSezStatusWFHApplicationStagesException;

	public SezStatusWFHApplicationStages updateImpl(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages);

	/**
	 * Returns the sez status wfh application stages with the primary key or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public SezStatusWFHApplicationStages findByPrimaryKey(
			long sezWFHAppStagesId)
		throws NoSuchSezStatusWFHApplicationStagesException;

	/**
	 * Returns the sez status wfh application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages, or <code>null</code> if a sez status wfh application stages with the primary key could not be found
	 */
	public SezStatusWFHApplicationStages fetchByPrimaryKey(
		long sezWFHAppStagesId);

	/**
	 * Returns all the sez status wfh application stageses.
	 *
	 * @return the sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findAll();

	/**
	 * Returns a range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status wfh application stageses
	 */
	public java.util.List<SezStatusWFHApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status wfh application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status wfh application stageses.
	 *
	 * @return the number of sez status wfh application stageses
	 */
	public int countAll();

}