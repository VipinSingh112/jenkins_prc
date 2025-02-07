/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCurrentStageException;
import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCurrentStageUtil
 * @generated
 */
@ProviderType
public interface NcbjCurrentStagePersistence
	extends BasePersistence<NcbjCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjCurrentStageUtil} to access the ncbj current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
				orderByComparator)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
				orderByComparator)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns the ncbj current stages before and after the current ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjCurrentStageId the primary key of the current ncbj current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public NcbjCurrentStage[] findByUuid_PrevAndNext(
			long ncbjCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
				orderByComparator)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Removes all the ncbj current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ncbj current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ncbj current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj current stage that was removed
	 */
	public NcbjCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the number of ncbj current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
				orderByComparator)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
				orderByComparator)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns the ncbj current stages before and after the current ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjCurrentStageId the primary key of the current ncbj current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public NcbjCurrentStage[] findByUuid_C_PrevAndNext(
			long ncbjCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
				orderByComparator)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Removes all the ncbj current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage findBygetByNcbj_Stage(long ncbjApplicationId)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchBygetByNcbj_Stage(long ncbjApplicationId);

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public NcbjCurrentStage fetchBygetByNcbj_Stage(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj current stage where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj current stage that was removed
	 */
	public NcbjCurrentStage removeBygetByNcbj_Stage(long ncbjApplicationId)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the number of ncbj current stages where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj current stages
	 */
	public int countBygetByNcbj_Stage(long ncbjApplicationId);

	/**
	 * Caches the ncbj current stage in the entity cache if it is enabled.
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 */
	public void cacheResult(NcbjCurrentStage ncbjCurrentStage);

	/**
	 * Caches the ncbj current stages in the entity cache if it is enabled.
	 *
	 * @param ncbjCurrentStages the ncbj current stages
	 */
	public void cacheResult(java.util.List<NcbjCurrentStage> ncbjCurrentStages);

	/**
	 * Creates a new ncbj current stage with the primary key. Does not add the ncbj current stage to the database.
	 *
	 * @param ncbjCurrentStageId the primary key for the new ncbj current stage
	 * @return the new ncbj current stage
	 */
	public NcbjCurrentStage create(long ncbjCurrentStageId);

	/**
	 * Removes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public NcbjCurrentStage remove(long ncbjCurrentStageId)
		throws NoSuchNcbjCurrentStageException;

	public NcbjCurrentStage updateImpl(NcbjCurrentStage ncbjCurrentStage);

	/**
	 * Returns the ncbj current stage with the primary key or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public NcbjCurrentStage findByPrimaryKey(long ncbjCurrentStageId)
		throws NoSuchNcbjCurrentStageException;

	/**
	 * Returns the ncbj current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage, or <code>null</code> if a ncbj current stage with the primary key could not be found
	 */
	public NcbjCurrentStage fetchByPrimaryKey(long ncbjCurrentStageId);

	/**
	 * Returns all the ncbj current stages.
	 *
	 * @return the ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findAll();

	/**
	 * Returns a range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj current stages
	 */
	public java.util.List<NcbjCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj current stages.
	 *
	 * @return the number of ncbj current stages
	 */
	public int countAll();

}