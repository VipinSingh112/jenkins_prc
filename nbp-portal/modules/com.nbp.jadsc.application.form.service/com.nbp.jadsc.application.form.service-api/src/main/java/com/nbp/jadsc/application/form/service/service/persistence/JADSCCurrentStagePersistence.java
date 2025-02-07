/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCurrentStageException;
import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCurrentStageUtil
 * @generated
 */
@ProviderType
public interface JADSCCurrentStagePersistence
	extends BasePersistence<JADSCCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCCurrentStageUtil} to access the jadsc current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
				orderByComparator)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
				orderByComparator)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns the jadsc current stages before and after the current jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCurrentStageId the primary key of the current jadsc current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public JADSCCurrentStage[] findByUuid_PrevAndNext(
			long jadscCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
				orderByComparator)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Removes all the jadsc current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc current stage that was removed
	 */
	public JADSCCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the number of jadsc current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
				orderByComparator)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
				orderByComparator)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns the jadsc current stages before and after the current jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCurrentStageId the primary key of the current jadsc current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public JADSCCurrentStage[] findByUuid_C_PrevAndNext(
			long jadscCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
				orderByComparator)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Removes all the jadsc current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage findBygetByJadsc_Stage(long jadscApplicationId)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchBygetByJadsc_Stage(long jadscApplicationId);

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public JADSCCurrentStage fetchBygetByJadsc_Stage(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc current stage where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc current stage that was removed
	 */
	public JADSCCurrentStage removeBygetByJadsc_Stage(long jadscApplicationId)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the number of jadsc current stages where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc current stages
	 */
	public int countBygetByJadsc_Stage(long jadscApplicationId);

	/**
	 * Caches the jadsc current stage in the entity cache if it is enabled.
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 */
	public void cacheResult(JADSCCurrentStage jadscCurrentStage);

	/**
	 * Caches the jadsc current stages in the entity cache if it is enabled.
	 *
	 * @param jadscCurrentStages the jadsc current stages
	 */
	public void cacheResult(
		java.util.List<JADSCCurrentStage> jadscCurrentStages);

	/**
	 * Creates a new jadsc current stage with the primary key. Does not add the jadsc current stage to the database.
	 *
	 * @param jadscCurrentStageId the primary key for the new jadsc current stage
	 * @return the new jadsc current stage
	 */
	public JADSCCurrentStage create(long jadscCurrentStageId);

	/**
	 * Removes the jadsc current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage that was removed
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public JADSCCurrentStage remove(long jadscCurrentStageId)
		throws NoSuchJADSCCurrentStageException;

	public JADSCCurrentStage updateImpl(JADSCCurrentStage jadscCurrentStage);

	/**
	 * Returns the jadsc current stage with the primary key or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public JADSCCurrentStage findByPrimaryKey(long jadscCurrentStageId)
		throws NoSuchJADSCCurrentStageException;

	/**
	 * Returns the jadsc current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage, or <code>null</code> if a jadsc current stage with the primary key could not be found
	 */
	public JADSCCurrentStage fetchByPrimaryKey(long jadscCurrentStageId);

	/**
	 * Returns all the jadsc current stages.
	 *
	 * @return the jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findAll();

	/**
	 * Returns a range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc current stages
	 */
	public java.util.List<JADSCCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc current stages.
	 *
	 * @return the number of jadsc current stages
	 */
	public int countAll();

}