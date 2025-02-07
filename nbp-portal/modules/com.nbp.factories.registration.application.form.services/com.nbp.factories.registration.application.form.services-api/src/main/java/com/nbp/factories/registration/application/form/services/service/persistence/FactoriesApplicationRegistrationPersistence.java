/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesApplicationRegistrationException;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories application registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistrationUtil
 * @generated
 */
@ProviderType
public interface FactoriesApplicationRegistrationPersistence
	extends BasePersistence<FactoriesApplicationRegistration> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesApplicationRegistrationUtil} to access the factories application registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration findBygetFactoriesRegistrationById(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegistrationById(
		long factoriesApplicationId);

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegistrationById(
		long factoriesApplicationId, boolean useFinderCache);

	/**
	 * Removes the factories application registration where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories application registration that was removed
	 */
	public FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationById(long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the number of factories application registrations where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegistrationById(long factoriesApplicationId);

	/**
	 * Returns all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId);

	/**
	 * Returns a range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationApplicationByStatusUser_First(
				int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationRegistration> orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationApplicationByStatusUser_Last(
				int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationRegistration> orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns the factories application registrations before and after the current factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param factoriesApplicationId the primary key of the current factories application registration
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public FactoriesApplicationRegistration[]
			findBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
				long factoriesApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationRegistration> orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Removes all the factories application registrations where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetFactoriesRegistrationApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns the number of factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegistrationApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns all the factories application registrations where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(int status);

	/**
	 * Returns a range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(int status, int start, int end);

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByStatus_First(
				int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationRegistration> orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByStatus_Last(
				int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationRegistration> orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns the factories application registrations before and after the current factories application registration in the ordered set where status = &#63;.
	 *
	 * @param factoriesApplicationId the primary key of the current factories application registration
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public FactoriesApplicationRegistration[]
			findBygetFactoriesRegistrationByStatus_PrevAndNext(
				long factoriesApplicationId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoriesApplicationRegistration> orderByComparator)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Removes all the factories application registrations where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetFactoriesRegistrationByStatus(int status);

	/**
	 * Returns the number of factories application registrations where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegistrationByStatus(int status);

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByAppNo(String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByAppNo(String applicationNumber);

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByAppNo(
			String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the factories application registration where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the factories application registration that was removed
	 */
	public FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationByAppNo(String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the number of factories application registrations where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegistrationByAppNo(String applicationNumber);

	/**
	 * Returns the factories application registration where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByCaseId(String caseId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByCaseId(String caseId);

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByCaseId(
			String caseId, boolean useFinderCache);

	/**
	 * Removes the factories application registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application registration that was removed
	 */
	public FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationByCaseId(String caseId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the number of factories application registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegistrationByCaseId(String caseId);

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration findBygetFactoriesRegstBy_AppNo(
			String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_AppNo(
		String applicationNumber);

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_AppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the factories application registration where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the factories application registration that was removed
	 */
	public FactoriesApplicationRegistration removeBygetFactoriesRegstBy_AppNo(
			String applicationNumber)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the number of factories application registrations where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegstBy_AppNo(String applicationNumber);

	/**
	 * Returns the factories application registration where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration findBygetFactoriesRegstBy_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_CaseId(
		String caseId);

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the factories application registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application registration that was removed
	 */
	public FactoriesApplicationRegistration removeBygetFactoriesRegstBy_CaseId(
			String caseId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the number of factories application registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegstBy_CaseId(String caseId);

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration findBygetFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public FactoriesApplicationRegistration fetchBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the factories application registration that was removed
	 */
	public FactoriesApplicationRegistration removeBygetFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the number of factories application registrations where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching factories application registrations
	 */
	public int countBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the factories application registration in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationRegistration the factories application registration
	 */
	public void cacheResult(
		FactoriesApplicationRegistration factoriesApplicationRegistration);

	/**
	 * Caches the factories application registrations in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationRegistrations the factories application registrations
	 */
	public void cacheResult(
		java.util.List<FactoriesApplicationRegistration>
			factoriesApplicationRegistrations);

	/**
	 * Creates a new factories application registration with the primary key. Does not add the factories application registration to the database.
	 *
	 * @param factoriesApplicationId the primary key for the new factories application registration
	 * @return the new factories application registration
	 */
	public FactoriesApplicationRegistration create(long factoriesApplicationId);

	/**
	 * Removes the factories application registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration that was removed
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public FactoriesApplicationRegistration remove(long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException;

	public FactoriesApplicationRegistration updateImpl(
		FactoriesApplicationRegistration factoriesApplicationRegistration);

	/**
	 * Returns the factories application registration with the primary key or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public FactoriesApplicationRegistration findByPrimaryKey(
			long factoriesApplicationId)
		throws NoSuchFactoriesApplicationRegistrationException;

	/**
	 * Returns the factories application registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration, or <code>null</code> if a factories application registration with the primary key could not be found
	 */
	public FactoriesApplicationRegistration fetchByPrimaryKey(
		long factoriesApplicationId);

	/**
	 * Returns all the factories application registrations.
	 *
	 * @return the factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration> findAll();

	/**
	 * Returns a range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationRegistration> orderByComparator);

	/**
	 * Returns an ordered range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories application registrations
	 */
	public java.util.List<FactoriesApplicationRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesApplicationRegistration> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories application registrations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories application registrations.
	 *
	 * @return the number of factories application registrations
	 */
	public int countAll();

}