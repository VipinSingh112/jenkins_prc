/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManufacturingApplicationException;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manufacturing application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationUtil
 * @generated
 */
@ProviderType
public interface ManufacturingApplicationPersistence
	extends BasePersistence<ManufacturingApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManufacturingApplicationUtil} to access the manufacturing application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManuafactureByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the first manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManuafactureByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator);

	/**
	 * Returns the last manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManuafactureByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the last manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManuafactureByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator);

	/**
	 * Returns the manufacturing applications before and after the current manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param manufacturingApplicationId the primary key of the current manufacturing application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public ManufacturingApplication[] findBygetManuafactureByS_U_PrevAndNext(
			long manufacturingApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Removes all the manufacturing applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetManuafactureByS_U(long userId, int status);

	/**
	 * Returns the number of manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching manufacturing applications
	 */
	public int countBygetManuafactureByS_U(long userId, int status);

	/**
	 * Returns all the manufacturing applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication>
		findBygetManufacturingByStatus(int status);

	/**
	 * Returns a range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication>
		findBygetManufacturingByStatus(int status, int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication>
		findBygetManufacturingByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing applications
	 */
	public java.util.List<ManufacturingApplication>
		findBygetManufacturingByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManufacturingByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the first manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator);

	/**
	 * Returns the last manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManufacturingByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the last manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator);

	/**
	 * Returns the manufacturing applications before and after the current manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param manufacturingApplicationId the primary key of the current manufacturing application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public ManufacturingApplication[]
			findBygetManufacturingByStatus_PrevAndNext(
				long manufacturingApplicationId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<ManufacturingApplication> orderByComparator)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Removes all the manufacturing applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetManufacturingByStatus(int status);

	/**
	 * Returns the number of manufacturing applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching manufacturing applications
	 */
	public int countBygetManufacturingByStatus(int status);

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManufacturingByAppNum(
			String applicationNumber)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByAppNum(
		String applicationNumber);

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the manufacturing application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the manufacturing application that was removed
	 */
	public ManufacturingApplication removeBygetManufacturingByAppNum(
			String applicationNumber)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the number of manufacturing applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching manufacturing applications
	 */
	public int countBygetManufacturingByAppNum(String applicationNumber);

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManufacturingByRT_AppNo(
			String licenseRequest, String expiredLicenseAppNumber)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber);

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the manufacturing application that was removed
	 */
	public ManufacturingApplication removeBygetManufacturingByRT_AppNo(
			String licenseRequest, String expiredLicenseAppNumber)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the number of manufacturing applications where licenseRequest = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching manufacturing applications
	 */
	public int countBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber);

	/**
	 * Returns the manufacturing application where caseId = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication findBygetManufacturingByCaseId(
			String caseId)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the manufacturing application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByCaseId(
		String caseId);

	/**
	 * Returns the manufacturing application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public ManufacturingApplication fetchBygetManufacturingByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the manufacturing application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing application that was removed
	 */
	public ManufacturingApplication removeBygetManufacturingByCaseId(
			String caseId)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the number of manufacturing applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing applications
	 */
	public int countBygetManufacturingByCaseId(String caseId);

	/**
	 * Caches the manufacturing application in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplication the manufacturing application
	 */
	public void cacheResult(ManufacturingApplication manufacturingApplication);

	/**
	 * Caches the manufacturing applications in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplications the manufacturing applications
	 */
	public void cacheResult(
		java.util.List<ManufacturingApplication> manufacturingApplications);

	/**
	 * Creates a new manufacturing application with the primary key. Does not add the manufacturing application to the database.
	 *
	 * @param manufacturingApplicationId the primary key for the new manufacturing application
	 * @return the new manufacturing application
	 */
	public ManufacturingApplication create(long manufacturingApplicationId);

	/**
	 * Removes the manufacturing application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application that was removed
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public ManufacturingApplication remove(long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationException;

	public ManufacturingApplication updateImpl(
		ManufacturingApplication manufacturingApplication);

	/**
	 * Returns the manufacturing application with the primary key or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public ManufacturingApplication findByPrimaryKey(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationException;

	/**
	 * Returns the manufacturing application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application, or <code>null</code> if a manufacturing application with the primary key could not be found
	 */
	public ManufacturingApplication fetchByPrimaryKey(
		long manufacturingApplicationId);

	/**
	 * Returns all the manufacturing applications.
	 *
	 * @return the manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findAll();

	/**
	 * Returns a range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing applications
	 */
	public java.util.List<ManufacturingApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingApplication> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manufacturing applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manufacturing applications.
	 *
	 * @return the number of manufacturing applications
	 */
	public int countAll();

}