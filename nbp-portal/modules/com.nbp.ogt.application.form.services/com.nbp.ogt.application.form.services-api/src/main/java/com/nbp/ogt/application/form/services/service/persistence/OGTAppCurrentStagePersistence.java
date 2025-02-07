/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOGTAppCurrentStageException;
import com.nbp.ogt.application.form.services.model.OGTAppCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt app current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGTAppCurrentStageUtil
 * @generated
 */
@ProviderType
public interface OGTAppCurrentStagePersistence
	extends BasePersistence<OGTAppCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OGTAppCurrentStageUtil} to access the ogt app current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ogt app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
				orderByComparator)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
				orderByComparator)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the ogt app current stages before and after the current ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param ogtAppCurrentStageId the primary key of the current ogt app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public OGTAppCurrentStage[] findByUuid_PrevAndNext(
			long ogtAppCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
				orderByComparator)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Removes all the ogt app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ogt app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ogt app current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ogt app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ogt app current stage that was removed
	 */
	public OGTAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the number of ogt app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ogt app current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
				orderByComparator)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
				orderByComparator)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the ogt app current stages before and after the current ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ogtAppCurrentStageId the primary key of the current ogt app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public OGTAppCurrentStage[] findByUuid_C_PrevAndNext(
			long ogtAppCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
				orderByComparator)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Removes all the ogt app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ogt app current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage findBygetByOGT_Stage(long ogtApplicationId)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchBygetByOGT_Stage(long ogtApplicationId);

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public OGTAppCurrentStage fetchBygetByOGT_Stage(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt app current stage where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt app current stage that was removed
	 */
	public OGTAppCurrentStage removeBygetByOGT_Stage(long ogtApplicationId)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the number of ogt app current stages where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt app current stages
	 */
	public int countBygetByOGT_Stage(long ogtApplicationId);

	/**
	 * Caches the ogt app current stage in the entity cache if it is enabled.
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 */
	public void cacheResult(OGTAppCurrentStage ogtAppCurrentStage);

	/**
	 * Caches the ogt app current stages in the entity cache if it is enabled.
	 *
	 * @param ogtAppCurrentStages the ogt app current stages
	 */
	public void cacheResult(
		java.util.List<OGTAppCurrentStage> ogtAppCurrentStages);

	/**
	 * Creates a new ogt app current stage with the primary key. Does not add the ogt app current stage to the database.
	 *
	 * @param ogtAppCurrentStageId the primary key for the new ogt app current stage
	 * @return the new ogt app current stage
	 */
	public OGTAppCurrentStage create(long ogtAppCurrentStageId);

	/**
	 * Removes the ogt app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage that was removed
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public OGTAppCurrentStage remove(long ogtAppCurrentStageId)
		throws NoSuchOGTAppCurrentStageException;

	public OGTAppCurrentStage updateImpl(OGTAppCurrentStage ogtAppCurrentStage);

	/**
	 * Returns the ogt app current stage with the primary key or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public OGTAppCurrentStage findByPrimaryKey(long ogtAppCurrentStageId)
		throws NoSuchOGTAppCurrentStageException;

	/**
	 * Returns the ogt app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage, or <code>null</code> if a ogt app current stage with the primary key could not be found
	 */
	public OGTAppCurrentStage fetchByPrimaryKey(long ogtAppCurrentStageId);

	/**
	 * Returns all the ogt app current stages.
	 *
	 * @return the ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findAll();

	/**
	 * Returns a range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt app current stages
	 */
	public java.util.List<OGTAppCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OGTAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt app current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt app current stages.
	 *
	 * @return the number of ogt app current stages
	 */
	public int countAll();

}