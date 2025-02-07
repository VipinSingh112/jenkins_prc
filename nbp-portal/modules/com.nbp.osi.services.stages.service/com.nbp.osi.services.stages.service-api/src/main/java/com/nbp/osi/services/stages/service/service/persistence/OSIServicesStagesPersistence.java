/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.stages.service.exception.NoSuchOSIServicesStagesException;
import com.nbp.osi.services.stages.service.model.OSIServicesStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesUtil
 * @generated
 */
@ProviderType
public interface OSIServicesStagesPersistence
	extends BasePersistence<OSIServicesStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSIServicesStagesUtil} to access the osi services stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi services stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages[] findByUuid_PrevAndNext(
			long osiServicesStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Removes all the osi services stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi services stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findByUUID_G(String uuid, long groupId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi services stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services stages that was removed
	 */
	public OSIServicesStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the number of osi services stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages[] findByUuid_C_PrevAndNext(
			long osiServicesStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Removes all the osi services stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_OSIID(
			long osiServciesApplicationId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_OSIID(
		long osiServciesApplicationId);

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_OSIID(
		long osiServciesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services stages where osiServciesApplicationId = &#63; from the database.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the osi services stages that was removed
	 */
	public OSIServicesStages removeBygetOSI_Service_OSIID(
			long osiServciesApplicationId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the number of osi services stageses where osiServciesApplicationId = &#63;.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_OSIID(long osiServciesApplicationId);

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the osi services stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi services stages that was removed
	 */
	public OSIServicesStages removeBygetOSI_Service_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns all the osi services stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName);

	/**
	 * Returns a range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the first osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the last osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the last osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages[] findBygetOSI_Service_StageName_PrevAndNext(
			long osiServicesStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Removes all the osi services stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetOSI_Service_StageName(String stageName);

	/**
	 * Returns the number of osi services stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_StageName(String stageName);

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi services stages that was removed
	 */
	public OSIServicesStages removeBygetOSI_Service_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the osi services stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi services stages that was removed
	 */
	public OSIServicesStages removeBygetOSI_Service_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId);

	/**
	 * Returns a range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public java.util.List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the first osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the last osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the last osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages[] findBygetOSI_Service_CaseId_PrevAndNext(
			long osiServicesStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
				orderByComparator)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Removes all the osi services stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetOSI_Service_CaseId(String caseId);

	/**
	 * Returns the number of osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_CaseId(String caseId);

	/**
	 * Returns the osi services stages where caseId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public OSIServicesStages findBygetOSI_Service_By_CaseId(String caseId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_By_CaseId(String caseId);

	/**
	 * Returns the osi services stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public OSIServicesStages fetchBygetOSI_Service_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi services stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services stages that was removed
	 */
	public OSIServicesStages removeBygetOSI_Service_By_CaseId(String caseId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the number of osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services stageses
	 */
	public int countBygetOSI_Service_By_CaseId(String caseId);

	/**
	 * Caches the osi services stages in the entity cache if it is enabled.
	 *
	 * @param osiServicesStages the osi services stages
	 */
	public void cacheResult(OSIServicesStages osiServicesStages);

	/**
	 * Caches the osi services stageses in the entity cache if it is enabled.
	 *
	 * @param osiServicesStageses the osi services stageses
	 */
	public void cacheResult(
		java.util.List<OSIServicesStages> osiServicesStageses);

	/**
	 * Creates a new osi services stages with the primary key. Does not add the osi services stages to the database.
	 *
	 * @param osiServicesStagesId the primary key for the new osi services stages
	 * @return the new osi services stages
	 */
	public OSIServicesStages create(long osiServicesStagesId);

	/**
	 * Removes the osi services stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages that was removed
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages remove(long osiServicesStagesId)
		throws NoSuchOSIServicesStagesException;

	public OSIServicesStages updateImpl(OSIServicesStages osiServicesStages);

	/**
	 * Returns the osi services stages with the primary key or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages findByPrimaryKey(long osiServicesStagesId)
		throws NoSuchOSIServicesStagesException;

	/**
	 * Returns the osi services stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages, or <code>null</code> if a osi services stages with the primary key could not be found
	 */
	public OSIServicesStages fetchByPrimaryKey(long osiServicesStagesId);

	/**
	 * Returns all the osi services stageses.
	 *
	 * @return the osi services stageses
	 */
	public java.util.List<OSIServicesStages> findAll();

	/**
	 * Returns a range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of osi services stageses
	 */
	public java.util.List<OSIServicesStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services stageses
	 */
	public java.util.List<OSIServicesStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services stageses
	 */
	public java.util.List<OSIServicesStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServicesStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services stageses.
	 *
	 * @return the number of osi services stageses
	 */
	public int countAll();

}