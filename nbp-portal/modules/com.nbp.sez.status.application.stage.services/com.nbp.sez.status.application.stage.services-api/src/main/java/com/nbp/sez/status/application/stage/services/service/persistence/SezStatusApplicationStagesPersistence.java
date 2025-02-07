/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface SezStatusApplicationStagesPersistence
	extends BasePersistence<SezStatusApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusApplicationStagesUtil} to access the sez status application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages[] findByUuid_PrevAndNext(
			long SezStatusApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Removes all the sez status application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sez status application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sez status application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status application stages that was removed
	 */
	public SezStatusApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the number of sez status application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages[] findByUuid_C_PrevAndNext(
			long SezStatusApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Removes all the sez status application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId);

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez status application stages where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status application stages that was removed
	 */
	public SezStatusApplicationStages removeBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the number of sez status application stageses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_SAI(long sezStatusApplicationId);

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the sez status application stages that was removed
	 */
	public SezStatusApplicationStages removeBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the sez status application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName);

	/**
	 * Returns a range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the first sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the last sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the last sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages[] findBygetSAS_StageName_PrevAndNext(
			long SezStatusApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Removes all the sez status application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetSAS_StageName(String stageName);

	/**
	 * Returns the number of sez status application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_StageName(String stageName);

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the sez status application stages that was removed
	 */
	public SezStatusApplicationStages removeBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the sez status application stages that was removed
	 */
	public SezStatusApplicationStages removeBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the first sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the last sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the last sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages[] findBygetSAS_CaseId_PrevAndNext(
			long SezStatusApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplicationStages> orderByComparator)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Removes all the sez status application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetSAS_CaseId(String caseId);

	/**
	 * Returns the number of sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_CaseId(String caseId);

	/**
	 * Returns the sez status application stages where caseId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages findBygetSAS_By_CaseId(String caseId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_By_CaseId(String caseId);

	/**
	 * Returns the sez status application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public SezStatusApplicationStages fetchBygetSAS_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status application stages that was removed
	 */
	public SezStatusApplicationStages removeBygetSAS_By_CaseId(String caseId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the number of sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status application stageses
	 */
	public int countBygetSAS_By_CaseId(String caseId);

	/**
	 * Caches the sez status application stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 */
	public void cacheResult(
		SezStatusApplicationStages sezStatusApplicationStages);

	/**
	 * Caches the sez status application stageses in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationStageses the sez status application stageses
	 */
	public void cacheResult(
		java.util.List<SezStatusApplicationStages>
			sezStatusApplicationStageses);

	/**
	 * Creates a new sez status application stages with the primary key. Does not add the sez status application stages to the database.
	 *
	 * @param SezStatusApplicationStagesId the primary key for the new sez status application stages
	 * @return the new sez status application stages
	 */
	public SezStatusApplicationStages create(long SezStatusApplicationStagesId);

	/**
	 * Removes the sez status application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages that was removed
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages remove(long SezStatusApplicationStagesId)
		throws NoSuchSezStatusApplicationStagesException;

	public SezStatusApplicationStages updateImpl(
		SezStatusApplicationStages sezStatusApplicationStages);

	/**
	 * Returns the sez status application stages with the primary key or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages findByPrimaryKey(
			long SezStatusApplicationStagesId)
		throws NoSuchSezStatusApplicationStagesException;

	/**
	 * Returns the sez status application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages, or <code>null</code> if a sez status application stages with the primary key could not be found
	 */
	public SezStatusApplicationStages fetchByPrimaryKey(
		long SezStatusApplicationStagesId);

	/**
	 * Returns all the sez status application stageses.
	 *
	 * @return the sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findAll();

	/**
	 * Returns a range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status application stageses
	 */
	public java.util.List<SezStatusApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status application stageses.
	 *
	 * @return the number of sez status application stageses
	 */
	public int countAll();

}