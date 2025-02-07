/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismApplicationStagesException;
import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface TourismApplicationStagesPersistence
	extends BasePersistence<TourismApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismApplicationStagesUtil} to access the tourism application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages[] findByUuid_PrevAndNext(
			long tourismApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Removes all the tourism application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of tourism application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tourism application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the tourism application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tourism application stages that was removed
	 */
	public TourismApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the number of tourism application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tourism application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages[] findByUuid_C_PrevAndNext(
			long tourismApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Removes all the tourism application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tourism application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_TAI(long tourismApplicationId)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_TAI(
		long tourismApplicationId);

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_TAI(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism application stages where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application stages that was removed
	 */
	public TourismApplicationStages removeBygetTAS_TAI(
			long tourismApplicationId)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the number of tourism application stageses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_TAI(long tourismApplicationId);

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the tourism application stages that was removed
	 */
	public TourismApplicationStages removeBygetTAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the tourism application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName);

	/**
	 * Returns a range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages[] findBygetTAS_StageName_PrevAndNext(
			long tourismApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Removes all the tourism application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetTAS_StageName(String stageName);

	/**
	 * Returns the number of tourism application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_StageName(String stageName);

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the tourism application stages that was removed
	 */
	public TourismApplicationStages removeBygetTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the tourism application stages that was removed
	 */
	public TourismApplicationStages removeBygetTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus);

	/**
	 * Returns a range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_SNAndSS_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_SNAndSS_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_SNAndSS_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_SNAndSS_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages[] findBygetTAS_SNAndSS_PrevAndNext(
			long tourismApplicationStagesId, String stageName,
			String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Removes all the tourism application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetTAS_SNAndSS(String stageName, String stageStatus);

	/**
	 * Returns the number of tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_SNAndSS(String stageName, String stageStatus);

	/**
	 * Returns all the tourism application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the first tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the last tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages findBygetTAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the last tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public TourismApplicationStages fetchBygetTAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages[] findBygetTAS_CaseId_PrevAndNext(
			long tourismApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Removes all the tourism application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetTAS_CaseId(String caseId);

	/**
	 * Returns the number of tourism application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism application stageses
	 */
	public int countBygetTAS_CaseId(String caseId);

	/**
	 * Caches the tourism application stages in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationStages the tourism application stages
	 */
	public void cacheResult(TourismApplicationStages tourismApplicationStages);

	/**
	 * Caches the tourism application stageses in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationStageses the tourism application stageses
	 */
	public void cacheResult(
		java.util.List<TourismApplicationStages> tourismApplicationStageses);

	/**
	 * Creates a new tourism application stages with the primary key. Does not add the tourism application stages to the database.
	 *
	 * @param tourismApplicationStagesId the primary key for the new tourism application stages
	 * @return the new tourism application stages
	 */
	public TourismApplicationStages create(long tourismApplicationStagesId);

	/**
	 * Removes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages remove(long tourismApplicationStagesId)
		throws NoSuchTourismApplicationStagesException;

	public TourismApplicationStages updateImpl(
		TourismApplicationStages tourismApplicationStages);

	/**
	 * Returns the tourism application stages with the primary key or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages findByPrimaryKey(
			long tourismApplicationStagesId)
		throws NoSuchTourismApplicationStagesException;

	/**
	 * Returns the tourism application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages, or <code>null</code> if a tourism application stages with the primary key could not be found
	 */
	public TourismApplicationStages fetchByPrimaryKey(
		long tourismApplicationStagesId);

	/**
	 * Returns all the tourism application stageses.
	 *
	 * @return the tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findAll();

	/**
	 * Returns a range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application stageses
	 */
	public java.util.List<TourismApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism application stageses.
	 *
	 * @return the number of tourism application stageses
	 */
	public int countAll();

}