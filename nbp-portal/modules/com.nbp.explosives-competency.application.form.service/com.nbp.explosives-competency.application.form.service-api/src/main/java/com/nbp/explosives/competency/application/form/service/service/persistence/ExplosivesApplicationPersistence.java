/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosivesApplicationException;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosives application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationUtil
 * @generated
 */
@ProviderType
public interface ExplosivesApplicationPersistence
	extends BasePersistence<ExplosivesApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosivesApplicationUtil} to access the explosives application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the explosives applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where uuid = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication[] findByUuid_PrevAndNext(
			long explosivesApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Removes all the explosives applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of explosives applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosives applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the explosives application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the explosives application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosives application that was removed
	 */
	public ExplosivesApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the number of explosives applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosives applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the first explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the last explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication[] findByUuid_C_PrevAndNext(
			long explosivesApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Removes all the explosives applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of explosives applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosives applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveById(
		long explosivesApplicationId);

	/**
	 * Returns the explosives application where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache);

	/**
	 * Removes the explosives application where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosives application that was removed
	 */
	public ExplosivesApplication removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the number of explosives applications where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveById(long explosivesApplicationId);

	/**
	 * Returns all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching explosives applications
	 */
	public java.util.List<ExplosivesApplication>
		findBygetExplosiveAppByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication>
		findBygetExplosiveAppByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication>
		findBygetExplosiveAppByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication>
		findBygetExplosiveAppByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveAppByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the first explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveAppByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the last explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveAppByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the last explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveAppByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication[]
			findBygetExplosiveAppByStatusUser_PrevAndNext(
				long explosivesApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Removes all the explosives applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetExplosiveAppByStatusUser(int status, long userId);

	/**
	 * Returns the number of explosives applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveAppByStatusUser(int status, long userId);

	/**
	 * Returns all the explosives applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status);

	/**
	 * Returns a range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the explosives applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosives applications
	 */
	public java.util.List<ExplosivesApplication> findBygetExplosiveByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the first explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the last explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the last explosives application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns the explosives applications before and after the current explosives application in the ordered set where status = &#63;.
	 *
	 * @param explosivesApplicationId the primary key of the current explosives application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication[] findBygetExplosiveByStatus_PrevAndNext(
			long explosivesApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosivesApplication> orderByComparator)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Removes all the explosives applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetExplosiveByStatus(int status);

	/**
	 * Returns the number of explosives applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveByStatus(int status);

	/**
	 * Returns the explosives application where applicationNumber = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveByAppNo(
			String applicationNumber)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveByAppNo(
		String applicationNumber);

	/**
	 * Returns the explosives application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the explosives application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the explosives application that was removed
	 */
	public ExplosivesApplication removeBygetExplosiveByAppNo(
			String applicationNumber)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the number of explosives applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveByAppNo(String applicationNumber);

	/**
	 * Returns the explosives application where caseId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveByCaseId(String caseId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveByCaseId(String caseId);

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the explosives application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosives application that was removed
	 */
	public ExplosivesApplication removeBygetExplosiveByCaseId(String caseId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the number of explosives applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveByCaseId(String caseId);

	/**
	 * Returns the explosives application where caseId = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveRegstBy_CaseId(String caseId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveRegstBy_CaseId(
		String caseId);

	/**
	 * Returns the explosives application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveRegstBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the explosives application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosives application that was removed
	 */
	public ExplosivesApplication removeBygetExplosiveRegstBy_CaseId(
			String caseId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the number of explosives applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveRegstBy_CaseId(String caseId);

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching explosives application
	 * @throws NoSuchExplosivesApplicationException if a matching explosives application could not be found
	 */
	public ExplosivesApplication findBygetExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public ExplosivesApplication fetchBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the explosives application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the explosives application that was removed
	 */
	public ExplosivesApplication removeBygetExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the number of explosives applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching explosives applications
	 */
	public int countBygetExplosiveRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the explosives application in the entity cache if it is enabled.
	 *
	 * @param explosivesApplication the explosives application
	 */
	public void cacheResult(ExplosivesApplication explosivesApplication);

	/**
	 * Caches the explosives applications in the entity cache if it is enabled.
	 *
	 * @param explosivesApplications the explosives applications
	 */
	public void cacheResult(
		java.util.List<ExplosivesApplication> explosivesApplications);

	/**
	 * Creates a new explosives application with the primary key. Does not add the explosives application to the database.
	 *
	 * @param explosivesApplicationId the primary key for the new explosives application
	 * @return the new explosives application
	 */
	public ExplosivesApplication create(long explosivesApplicationId);

	/**
	 * Removes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication remove(long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException;

	public ExplosivesApplication updateImpl(
		ExplosivesApplication explosivesApplication);

	/**
	 * Returns the explosives application with the primary key or throws a <code>NoSuchExplosivesApplicationException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application
	 * @throws NoSuchExplosivesApplicationException if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication findByPrimaryKey(long explosivesApplicationId)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application, or <code>null</code> if a explosives application with the primary key could not be found
	 */
	public ExplosivesApplication fetchByPrimaryKey(
		long explosivesApplicationId);

	/**
	 * Returns all the explosives applications.
	 *
	 * @return the explosives applications
	 */
	public java.util.List<ExplosivesApplication> findAll();

	/**
	 * Returns a range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of explosives applications
	 */
	public java.util.List<ExplosivesApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosives applications
	 */
	public java.util.List<ExplosivesApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosives applications
	 */
	public java.util.List<ExplosivesApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosives applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosives applications.
	 *
	 * @return the number of explosives applications
	 */
	public int countAll();

}