/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveApplicationStagesException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosive application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface ExplosiveApplicationStagesPersistence
	extends BasePersistence<ExplosiveApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosiveApplicationStagesUtil} to access the explosive application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the explosive application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages[] findByUuid_PrevAndNext(
			long expApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Removes all the explosive application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of explosive application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the explosive application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive application stages that was removed
	 */
	public ExplosiveApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the number of explosive application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages[] findByUuid_C_PrevAndNext(
			long expApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Removes all the explosive application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_CAI(
			long explosiveApplicationId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CAI(
		long explosiveApplicationId);

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CAI(
		long explosiveApplicationId, boolean useFinderCache);

	/**
	 * Removes the explosive application stages where explosiveApplicationId = &#63; from the database.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the explosive application stages that was removed
	 */
	public ExplosiveApplicationStages removeBygetEXP_CAI(
			long explosiveApplicationId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the number of explosive application stageses where explosiveApplicationId = &#63;.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_CAI(long explosiveApplicationId);

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the explosive application stages that was removed
	 */
	public ExplosiveApplicationStages removeBygetEXP_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the explosive application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName);

	/**
	 * Returns a range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages[] findBygetEXP_StageName_PrevAndNext(
			long expApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Removes all the explosive application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetEXP_StageName(String stageName);

	/**
	 * Returns the number of explosive application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_StageName(String stageName);

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the explosive application stages that was removed
	 */
	public ExplosiveApplicationStages removeBygetEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the explosive application stages that was removed
	 */
	public ExplosiveApplicationStages removeBygetEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus);

	/**
	 * Returns a range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_SNAndSS_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_SNAndSS_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_SNAndSS_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_SNAndSS_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages[] findBygetEXP_SNAndSS_PrevAndNext(
			long expApplicationStagesId, String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Removes all the explosive application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetEXP_SNAndSS(String stageName, String stageStatus);

	/**
	 * Returns the number of explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_SNAndSS(String stageName, String stageStatus);

	/**
	 * Returns all the explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId);

	/**
	 * Returns a range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the first explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the last explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the last explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages[] findBygetEXP_CaseId_PrevAndNext(
			long expApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveApplicationStages> orderByComparator)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Removes all the explosive application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetEXP_CaseId(String caseId);

	/**
	 * Returns the number of explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_CaseId(String caseId);

	/**
	 * Returns the explosive application stages where caseId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages findBygetEXP_By_CaseId(String caseId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_By_CaseId(String caseId);

	/**
	 * Returns the explosive application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public ExplosiveApplicationStages fetchBygetEXP_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the explosive application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive application stages that was removed
	 */
	public ExplosiveApplicationStages removeBygetEXP_By_CaseId(String caseId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the number of explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive application stageses
	 */
	public int countBygetEXP_By_CaseId(String caseId);

	/**
	 * Caches the explosive application stages in the entity cache if it is enabled.
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 */
	public void cacheResult(
		ExplosiveApplicationStages explosiveApplicationStages);

	/**
	 * Caches the explosive application stageses in the entity cache if it is enabled.
	 *
	 * @param explosiveApplicationStageses the explosive application stageses
	 */
	public void cacheResult(
		java.util.List<ExplosiveApplicationStages>
			explosiveApplicationStageses);

	/**
	 * Creates a new explosive application stages with the primary key. Does not add the explosive application stages to the database.
	 *
	 * @param expApplicationStagesId the primary key for the new explosive application stages
	 * @return the new explosive application stages
	 */
	public ExplosiveApplicationStages create(long expApplicationStagesId);

	/**
	 * Removes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages remove(long expApplicationStagesId)
		throws NoSuchExplosiveApplicationStagesException;

	public ExplosiveApplicationStages updateImpl(
		ExplosiveApplicationStages explosiveApplicationStages);

	/**
	 * Returns the explosive application stages with the primary key or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages findByPrimaryKey(
			long expApplicationStagesId)
		throws NoSuchExplosiveApplicationStagesException;

	/**
	 * Returns the explosive application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages, or <code>null</code> if a explosive application stages with the primary key could not be found
	 */
	public ExplosiveApplicationStages fetchByPrimaryKey(
		long expApplicationStagesId);

	/**
	 * Returns all the explosive application stageses.
	 *
	 * @return the explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findAll();

	/**
	 * Returns a range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive application stageses
	 */
	public java.util.List<ExplosiveApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosive application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosive application stageses.
	 *
	 * @return the number of explosive application stageses
	 */
	public int countAll();

}