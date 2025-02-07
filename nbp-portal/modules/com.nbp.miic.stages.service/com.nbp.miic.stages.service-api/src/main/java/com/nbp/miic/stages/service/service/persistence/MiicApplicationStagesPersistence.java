/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.stages.service.exception.NoSuchMiicApplicationStagesException;
import com.nbp.miic.stages.service.model.MiicApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface MiicApplicationStagesPersistence
	extends BasePersistence<MiicApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicApplicationStagesUtil} to access the miic application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the miic application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages[] findByUuid_PrevAndNext(
			long miicApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Removes all the miic application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of miic application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching miic application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the miic application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the miic application stages that was removed
	 */
	public MiicApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the number of miic application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching miic application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages[] findByUuid_C_PrevAndNext(
			long miicApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Removes all the miic application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching miic application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_CAI(long miicApplicationId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CAI(long miicApplicationId);

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CAI(
		long miicApplicationId, boolean useFinderCache);

	/**
	 * Removes the miic application stages where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application stages that was removed
	 */
	public MiicApplicationStages removeBygetMIIC_CAI(long miicApplicationId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the number of miic application stageses where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_CAI(long miicApplicationId);

	/**
	 * Returns all the miic application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName);

	/**
	 * Returns a range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the first miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the last miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the last miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages[] findBygetMIIC_StageName_PrevAndNext(
			long miicApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Removes all the miic application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetMIIC_StageName(String stageName);

	/**
	 * Returns the number of miic application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_StageName(String stageName);

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the miic application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the miic application stages that was removed
	 */
	public MiicApplicationStages removeBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the miic application stages that was removed
	 */
	public MiicApplicationStages removeBygetMIIC_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the miic application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the miic application stages that was removed
	 */
	public MiicApplicationStages removeBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId);

	/**
	 * Returns a range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the first miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the last miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the last miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages[] findBygetMIIC_CaseId_PrevAndNext(
			long miicApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiicApplicationStages> orderByComparator)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Removes all the miic application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMIIC_CaseId(String caseId);

	/**
	 * Returns the number of miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_CaseId(String caseId);

	/**
	 * Returns the miic application stages where caseId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public MiicApplicationStages findBygetMIIC_By_CaseId(String caseId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_By_CaseId(String caseId);

	/**
	 * Returns the miic application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public MiicApplicationStages fetchBygetMIIC_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the miic application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic application stages that was removed
	 */
	public MiicApplicationStages removeBygetMIIC_By_CaseId(String caseId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the number of miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic application stageses
	 */
	public int countBygetMIIC_By_CaseId(String caseId);

	/**
	 * Caches the miic application stages in the entity cache if it is enabled.
	 *
	 * @param miicApplicationStages the miic application stages
	 */
	public void cacheResult(MiicApplicationStages miicApplicationStages);

	/**
	 * Caches the miic application stageses in the entity cache if it is enabled.
	 *
	 * @param miicApplicationStageses the miic application stageses
	 */
	public void cacheResult(
		java.util.List<MiicApplicationStages> miicApplicationStageses);

	/**
	 * Creates a new miic application stages with the primary key. Does not add the miic application stages to the database.
	 *
	 * @param miicApplicationStagesId the primary key for the new miic application stages
	 * @return the new miic application stages
	 */
	public MiicApplicationStages create(long miicApplicationStagesId);

	/**
	 * Removes the miic application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages that was removed
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages remove(long miicApplicationStagesId)
		throws NoSuchMiicApplicationStagesException;

	public MiicApplicationStages updateImpl(
		MiicApplicationStages miicApplicationStages);

	/**
	 * Returns the miic application stages with the primary key or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages findByPrimaryKey(long miicApplicationStagesId)
		throws NoSuchMiicApplicationStagesException;

	/**
	 * Returns the miic application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages, or <code>null</code> if a miic application stages with the primary key could not be found
	 */
	public MiicApplicationStages fetchByPrimaryKey(
		long miicApplicationStagesId);

	/**
	 * Returns all the miic application stageses.
	 *
	 * @return the miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findAll();

	/**
	 * Returns a range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic application stageses
	 */
	public java.util.List<MiicApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic application stageses.
	 *
	 * @return the number of miic application stageses
	 */
	public int countAll();

}