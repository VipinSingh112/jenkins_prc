/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingApplicationStagesException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manufacturing application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface ManufacturingApplicationStagesPersistence
	extends BasePersistence<ManufacturingApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManufacturingApplicationStagesUtil} to access the manufacturing application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_MAI(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_MAI(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manufacturing application stages where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manufacturing application stages that was removed
	 */
	public ManufacturingApplicationStages removeBygetMAS_MAI(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the number of manufacturing application stageses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_MAI(long manufacturingApplicationId);

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the manufacturing application stages that was removed
	 */
	public ManufacturingApplicationStages removeBygetMAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the manufacturing application stages that was removed
	 */
	public ManufacturingApplicationStages removeBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the manufacturing application stages that was removed
	 */
	public ManufacturingApplicationStages removeBygetMAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the manufacturing application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the first manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns the last manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the last manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public ManufacturingApplicationStages[] findBygetMAS_CaseId_PrevAndNext(
			long manufacturingAppStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Removes all the manufacturing application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMAS_CaseId(String caseId);

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_CaseId(String caseId);

	/**
	 * Returns all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_SN_Status(String stageStatus, String stageName);

	/**
	 * Returns a range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_SN_Status(
			String stageStatus, String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_SN_Status(
			String stageStatus, String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_SN_Status(
			String stageStatus, String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_SN_Status_First(
			String stageStatus, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_SN_Status_First(
		String stageStatus, String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_SN_Status_Last(
			String stageStatus, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_SN_Status_Last(
		String stageStatus, String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public ManufacturingApplicationStages[] findBygetMAS_SN_Status_PrevAndNext(
			long manufacturingAppStagesId, String stageStatus, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Removes all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 */
	public void removeBygetMAS_SN_Status(String stageStatus, String stageName);

	/**
	 * Returns the number of manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_SN_Status(String stageStatus, String stageName);

	/**
	 * Returns all the manufacturing application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_StageName(String stageName);

	/**
	 * Returns a range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_StageName(String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages>
		findBygetMAS_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages findBygetMAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public ManufacturingApplicationStages fetchBygetMAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public ManufacturingApplicationStages[] findBygetMAS_StageName_PrevAndNext(
			long manufacturingAppStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Removes all the manufacturing application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetMAS_StageName(String stageName);

	/**
	 * Returns the number of manufacturing application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public int countBygetMAS_StageName(String stageName);

	/**
	 * Caches the manufacturing application stages in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 */
	public void cacheResult(
		ManufacturingApplicationStages manufacturingApplicationStages);

	/**
	 * Caches the manufacturing application stageses in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplicationStageses the manufacturing application stageses
	 */
	public void cacheResult(
		java.util.List<ManufacturingApplicationStages>
			manufacturingApplicationStageses);

	/**
	 * Creates a new manufacturing application stages with the primary key. Does not add the manufacturing application stages to the database.
	 *
	 * @param manufacturingAppStagesId the primary key for the new manufacturing application stages
	 * @return the new manufacturing application stages
	 */
	public ManufacturingApplicationStages create(long manufacturingAppStagesId);

	/**
	 * Removes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public ManufacturingApplicationStages remove(long manufacturingAppStagesId)
		throws NoSuchManufacturingApplicationStagesException;

	public ManufacturingApplicationStages updateImpl(
		ManufacturingApplicationStages manufacturingApplicationStages);

	/**
	 * Returns the manufacturing application stages with the primary key or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public ManufacturingApplicationStages findByPrimaryKey(
			long manufacturingAppStagesId)
		throws NoSuchManufacturingApplicationStagesException;

	/**
	 * Returns the manufacturing application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages, or <code>null</code> if a manufacturing application stages with the primary key could not be found
	 */
	public ManufacturingApplicationStages fetchByPrimaryKey(
		long manufacturingAppStagesId);

	/**
	 * Returns all the manufacturing application stageses.
	 *
	 * @return the manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findAll();

	/**
	 * Returns a range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing application stageses
	 */
	public java.util.List<ManufacturingApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manufacturing application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manufacturing application stageses.
	 *
	 * @return the number of manufacturing application stageses
	 */
	public int countAll();

}