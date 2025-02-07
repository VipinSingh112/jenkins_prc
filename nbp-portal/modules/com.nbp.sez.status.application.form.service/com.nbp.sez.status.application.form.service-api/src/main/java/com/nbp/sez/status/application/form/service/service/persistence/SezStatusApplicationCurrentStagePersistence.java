/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusApplicationCurrentStageException;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface SezStatusApplicationCurrentStagePersistence
	extends BasePersistence<SezStatusApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusApplicationCurrentStageUtil} to access the sez status application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationCurrentStage> orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationCurrentStage> orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the sez status application current stages before and after the current sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param sezStageId the primary key of the current sez status application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public SezStatusApplicationCurrentStage[] findByUuid_PrevAndNext(
			long sezStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationCurrentStage> orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Removes all the sez status application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sez status application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status application current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sez status application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status application current stage that was removed
	 */
	public SezStatusApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the number of sez status application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status application current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationCurrentStage> orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationCurrentStage> orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the sez status application current stages before and after the current sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStageId the primary key of the current sez status application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public SezStatusApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long sezStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationCurrentStage> orderByComparator)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Removes all the sez status application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status application current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage findBygetSEZ_Stage_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchBygetSEZ_Stage_SAI(
		long sezStatusApplicationId);

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public SezStatusApplicationCurrentStage fetchBygetSEZ_Stage_SAI(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez status application current stage where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status application current stage that was removed
	 */
	public SezStatusApplicationCurrentStage removeBygetSEZ_Stage_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the number of sez status application current stages where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status application current stages
	 */
	public int countBygetSEZ_Stage_SAI(long sezStatusApplicationId);

	/**
	 * Caches the sez status application current stage in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 */
	public void cacheResult(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage);

	/**
	 * Caches the sez status application current stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationCurrentStages the sez status application current stages
	 */
	public void cacheResult(
		java.util.List<SezStatusApplicationCurrentStage>
			sezStatusApplicationCurrentStages);

	/**
	 * Creates a new sez status application current stage with the primary key. Does not add the sez status application current stage to the database.
	 *
	 * @param sezStageId the primary key for the new sez status application current stage
	 * @return the new sez status application current stage
	 */
	public SezStatusApplicationCurrentStage create(long sezStageId);

	/**
	 * Removes the sez status application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage that was removed
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public SezStatusApplicationCurrentStage remove(long sezStageId)
		throws NoSuchSezStatusApplicationCurrentStageException;

	public SezStatusApplicationCurrentStage updateImpl(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage);

	/**
	 * Returns the sez status application current stage with the primary key or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public SezStatusApplicationCurrentStage findByPrimaryKey(long sezStageId)
		throws NoSuchSezStatusApplicationCurrentStageException;

	/**
	 * Returns the sez status application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage, or <code>null</code> if a sez status application current stage with the primary key could not be found
	 */
	public SezStatusApplicationCurrentStage fetchByPrimaryKey(long sezStageId);

	/**
	 * Returns all the sez status application current stages.
	 *
	 * @return the sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status application current stages
	 */
	public java.util.List<SezStatusApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status application current stages.
	 *
	 * @return the number of sez status application current stages
	 */
	public int countAll();

}