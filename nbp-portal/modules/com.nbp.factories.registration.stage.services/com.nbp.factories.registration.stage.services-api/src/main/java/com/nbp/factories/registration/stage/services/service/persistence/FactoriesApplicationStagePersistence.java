/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesApplicationStageException;
import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStageUtil
 * @generated
 */
@ProviderType
public interface FactoriesApplicationStagePersistence
	extends BasePersistence<FactoriesApplicationStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesApplicationStageUtil} to access the factories application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the factories application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage[] findByUuid_PrevAndNext(
			long factoriesApplicationStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Removes all the factories application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of factories application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching factories application stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the factories application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the factories application stage that was removed
	 */
	public FactoriesApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the number of factories application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching factories application stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage[] findByUuid_C_PrevAndNext(
			long factoriesApplicationStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Removes all the factories application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching factories application stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_AI(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_AI(
		long factoriesApplicationId);

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_AI(
		long factoriesApplicationId, boolean useFinderCache);

	/**
	 * Removes the factories application stage where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories application stage that was removed
	 */
	public FactoriesApplicationStage removeBygetFactories_By_AI(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the number of factories application stages where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories application stages
	 */
	public int countBygetFactories_By_AI(long factoriesApplicationId);

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the factories application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the factories application stage that was removed
	 */
	public FactoriesApplicationStage removeBygetFactories_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	public int countBygetFactories_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the factories application stage where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findByget_Factories_By_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByget_Factories_By_CaseId(
		String caseId);

	/**
	 * Returns the factories application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchByget_Factories_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the factories application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application stage that was removed
	 */
	public FactoriesApplicationStage removeByget_Factories_By_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the number of factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application stages
	 */
	public int countByget_Factories_By_CaseId(String caseId);

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the factories application stage that was removed
	 */
	public FactoriesApplicationStage removeBygetFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	public int countBygetFactories_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the factories application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the factories application stage that was removed
	 */
	public FactoriesApplicationStage removeBygetFactories_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching factories application stages
	 */
	public int countBygetFactories_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_CaseId(String caseId);

	/**
	 * Returns a range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_CaseId(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the first factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the last factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the last factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage[] findBygetFactories_By_CaseId_PrevAndNext(
			long factoriesApplicationStageId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Removes all the factories application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFactories_By_CaseId(String caseId);

	/**
	 * Returns the number of factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application stages
	 */
	public int countBygetFactories_By_CaseId(String caseId);

	/**
	 * Returns all the factories application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(String stageName);

	/**
	 * Returns a range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public java.util.List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the first factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the last factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage findBygetFactories_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the last factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public FactoriesApplicationStage fetchBygetFactories_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage[]
			findBygetFactories_By_StageName_PrevAndNext(
				long factoriesApplicationStageId, String stageName,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationStage> orderByComparator)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Removes all the factories application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetFactories_By_StageName(String stageName);

	/**
	 * Returns the number of factories application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	public int countBygetFactories_By_StageName(String stageName);

	/**
	 * Caches the factories application stage in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationStage the factories application stage
	 */
	public void cacheResult(
		FactoriesApplicationStage factoriesApplicationStage);

	/**
	 * Caches the factories application stages in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationStages the factories application stages
	 */
	public void cacheResult(
		java.util.List<FactoriesApplicationStage> factoriesApplicationStages);

	/**
	 * Creates a new factories application stage with the primary key. Does not add the factories application stage to the database.
	 *
	 * @param factoriesApplicationStageId the primary key for the new factories application stage
	 * @return the new factories application stage
	 */
	public FactoriesApplicationStage create(long factoriesApplicationStageId);

	/**
	 * Removes the factories application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage that was removed
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage remove(long factoriesApplicationStageId)
		throws NoSuchFactoriesApplicationStageException;

	public FactoriesApplicationStage updateImpl(
		FactoriesApplicationStage factoriesApplicationStage);

	/**
	 * Returns the factories application stage with the primary key or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage findByPrimaryKey(
			long factoriesApplicationStageId)
		throws NoSuchFactoriesApplicationStageException;

	/**
	 * Returns the factories application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage, or <code>null</code> if a factories application stage with the primary key could not be found
	 */
	public FactoriesApplicationStage fetchByPrimaryKey(
		long factoriesApplicationStageId);

	/**
	 * Returns all the factories application stages.
	 *
	 * @return the factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findAll();

	/**
	 * Returns a range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories application stages
	 */
	public java.util.List<FactoriesApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories application stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories application stages.
	 *
	 * @return the number of factories application stages
	 */
	public int countAll();

}