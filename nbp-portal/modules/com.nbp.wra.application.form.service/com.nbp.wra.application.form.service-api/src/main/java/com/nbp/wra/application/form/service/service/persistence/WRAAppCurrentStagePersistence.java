/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchWRAAppCurrentStageException;
import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra app current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppCurrentStageUtil
 * @generated
 */
@ProviderType
public interface WRAAppCurrentStagePersistence
	extends BasePersistence<WRAAppCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WRAAppCurrentStageUtil} to access the wra app current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the wra app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
				orderByComparator)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
				orderByComparator)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the wra app current stages before and after the current wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param wraAppCurrentStageId the primary key of the current wra app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public WRAAppCurrentStage[] findByUuid_PrevAndNext(
			long wraAppCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
				orderByComparator)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Removes all the wra app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of wra app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching wra app current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the wra app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the wra app current stage that was removed
	 */
	public WRAAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the number of wra app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching wra app current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
				orderByComparator)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
				orderByComparator)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the wra app current stages before and after the current wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param wraAppCurrentStageId the primary key of the current wra app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public WRAAppCurrentStage[] findByUuid_C_PrevAndNext(
			long wraAppCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
				orderByComparator)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Removes all the wra app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching wra app current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage findBygetByWRA_Stage(long wraApplicationId)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchBygetByWRA_Stage(long wraApplicationId);

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public WRAAppCurrentStage fetchBygetByWRA_Stage(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the wra app current stage where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra app current stage that was removed
	 */
	public WRAAppCurrentStage removeBygetByWRA_Stage(long wraApplicationId)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the number of wra app current stages where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra app current stages
	 */
	public int countBygetByWRA_Stage(long wraApplicationId);

	/**
	 * Caches the wra app current stage in the entity cache if it is enabled.
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 */
	public void cacheResult(WRAAppCurrentStage wraAppCurrentStage);

	/**
	 * Caches the wra app current stages in the entity cache if it is enabled.
	 *
	 * @param wraAppCurrentStages the wra app current stages
	 */
	public void cacheResult(
		java.util.List<WRAAppCurrentStage> wraAppCurrentStages);

	/**
	 * Creates a new wra app current stage with the primary key. Does not add the wra app current stage to the database.
	 *
	 * @param wraAppCurrentStageId the primary key for the new wra app current stage
	 * @return the new wra app current stage
	 */
	public WRAAppCurrentStage create(long wraAppCurrentStageId);

	/**
	 * Removes the wra app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage that was removed
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public WRAAppCurrentStage remove(long wraAppCurrentStageId)
		throws NoSuchWRAAppCurrentStageException;

	public WRAAppCurrentStage updateImpl(WRAAppCurrentStage wraAppCurrentStage);

	/**
	 * Returns the wra app current stage with the primary key or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public WRAAppCurrentStage findByPrimaryKey(long wraAppCurrentStageId)
		throws NoSuchWRAAppCurrentStageException;

	/**
	 * Returns the wra app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage, or <code>null</code> if a wra app current stage with the primary key could not be found
	 */
	public WRAAppCurrentStage fetchByPrimaryKey(long wraAppCurrentStageId);

	/**
	 * Returns all the wra app current stages.
	 *
	 * @return the wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findAll();

	/**
	 * Returns a range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra app current stages
	 */
	public java.util.List<WRAAppCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra app current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra app current stages.
	 *
	 * @return the number of wra app current stages
	 */
	public int countAll();

}