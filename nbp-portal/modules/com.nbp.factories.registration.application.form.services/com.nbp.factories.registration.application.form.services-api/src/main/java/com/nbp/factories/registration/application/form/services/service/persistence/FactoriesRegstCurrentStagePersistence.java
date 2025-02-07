/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesRegstCurrentStageException;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories regst current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStageUtil
 * @generated
 */
@ProviderType
public interface FactoriesRegstCurrentStagePersistence
	extends BasePersistence<FactoriesRegstCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesRegstCurrentStageUtil} to access the factories regst current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the factories regst current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns the factories regst current stages before and after the current factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param factoriesCurrentStageId the primary key of the current factories regst current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public FactoriesRegstCurrentStage[] findByUuid_PrevAndNext(
			long factoriesCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Removes all the factories regst current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of factories regst current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching factories regst current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the factories regst current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the factories regst current stage that was removed
	 */
	public FactoriesRegstCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the number of factories regst current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching factories regst current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns the factories regst current stages before and after the current factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param factoriesCurrentStageId the primary key of the current factories regst current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public FactoriesRegstCurrentStage[] findByUuid_C_PrevAndNext(
			long factoriesCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesRegstCurrentStage> orderByComparator)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Removes all the factories regst current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching factories regst current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage findBygetByFactories_Stage(
			long factoriesApplicationId)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchBygetByFactories_Stage(
		long factoriesApplicationId);

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public FactoriesRegstCurrentStage fetchBygetByFactories_Stage(
		long factoriesApplicationId, boolean useFinderCache);

	/**
	 * Removes the factories regst current stage where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories regst current stage that was removed
	 */
	public FactoriesRegstCurrentStage removeBygetByFactories_Stage(
			long factoriesApplicationId)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the number of factories regst current stages where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories regst current stages
	 */
	public int countBygetByFactories_Stage(long factoriesApplicationId);

	/**
	 * Caches the factories regst current stage in the entity cache if it is enabled.
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 */
	public void cacheResult(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage);

	/**
	 * Caches the factories regst current stages in the entity cache if it is enabled.
	 *
	 * @param factoriesRegstCurrentStages the factories regst current stages
	 */
	public void cacheResult(
		java.util.List<FactoriesRegstCurrentStage> factoriesRegstCurrentStages);

	/**
	 * Creates a new factories regst current stage with the primary key. Does not add the factories regst current stage to the database.
	 *
	 * @param factoriesCurrentStageId the primary key for the new factories regst current stage
	 * @return the new factories regst current stage
	 */
	public FactoriesRegstCurrentStage create(long factoriesCurrentStageId);

	/**
	 * Removes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public FactoriesRegstCurrentStage remove(long factoriesCurrentStageId)
		throws NoSuchFactoriesRegstCurrentStageException;

	public FactoriesRegstCurrentStage updateImpl(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage);

	/**
	 * Returns the factories regst current stage with the primary key or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public FactoriesRegstCurrentStage findByPrimaryKey(
			long factoriesCurrentStageId)
		throws NoSuchFactoriesRegstCurrentStageException;

	/**
	 * Returns the factories regst current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage, or <code>null</code> if a factories regst current stage with the primary key could not be found
	 */
	public FactoriesRegstCurrentStage fetchByPrimaryKey(
		long factoriesCurrentStageId);

	/**
	 * Returns all the factories regst current stages.
	 *
	 * @return the factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findAll();

	/**
	 * Returns a range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories regst current stages
	 */
	public java.util.List<FactoriesRegstCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesRegstCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories regst current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories regst current stages.
	 *
	 * @return the number of factories regst current stages
	 */
	public int countAll();

}