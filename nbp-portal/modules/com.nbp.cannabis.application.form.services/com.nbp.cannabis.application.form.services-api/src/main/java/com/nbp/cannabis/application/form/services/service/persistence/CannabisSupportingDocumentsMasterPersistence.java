/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisSupportingDocumentsMasterException;
import com.nbp.cannabis.application.form.services.model.CannabisSupportingDocumentsMaster;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis supporting documents master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMasterUtil
 * @generated
 */
@ProviderType
public interface CannabisSupportingDocumentsMasterPersistence
	extends BasePersistence<CannabisSupportingDocumentsMaster> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisSupportingDocumentsMasterUtil} to access the cannabis supporting documents master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @return the matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType);

	/**
	 * Returns a range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocProperty(
			String documentTye, String userType, String applicationType,
			String landType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocProperty_First(
				String documentTye, String userType, String applicationType,
				String landType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisSupportingDocumentsMaster> orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocProperty_First(
			String documentTye, String userType, String applicationType,
			String landType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocProperty_Last(
				String documentTye, String userType, String applicationType,
				String landType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisSupportingDocumentsMaster> orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocProperty_Last(
			String documentTye, String userType, String applicationType,
			String landType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns the cannabis supporting documents masters before and after the current cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the current cannabis supporting documents master
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public CannabisSupportingDocumentsMaster[]
			findBygetSupportingDocProperty_PrevAndNext(
				long cannabisSupportingDocMasterId, String documentTye,
				String userType, String applicationType, String landType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisSupportingDocumentsMaster> orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Removes all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63; from the database.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 */
	public void removeBygetSupportingDocProperty(
		String documentTye, String userType, String applicationType,
		String landType);

	/**
	 * Returns the number of cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; and landType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param landType the land type
	 * @return the number of matching cannabis supporting documents masters
	 */
	public int countBygetSupportingDocProperty(
		String documentTye, String userType, String applicationType,
		String landType);

	/**
	 * Returns all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @return the matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType);

	/**
	 * Returns a range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster>
		findBygetSupportingDocApplicant(
			String documentTye, String userType, String applicationType,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocApplicant_First(
				String documentTye, String userType, String applicationType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisSupportingDocumentsMaster> orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Returns the first cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocApplicant_First(
			String documentTye, String userType, String applicationType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
			findBygetSupportingDocApplicant_Last(
				String documentTye, String userType, String applicationType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisSupportingDocumentsMaster> orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Returns the last cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supporting documents master, or <code>null</code> if a matching cannabis supporting documents master could not be found
	 */
	public CannabisSupportingDocumentsMaster
		fetchBygetSupportingDocApplicant_Last(
			String documentTye, String userType, String applicationType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns the cannabis supporting documents masters before and after the current cannabis supporting documents master in the ordered set where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the current cannabis supporting documents master
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public CannabisSupportingDocumentsMaster[]
			findBygetSupportingDocApplicant_PrevAndNext(
				long cannabisSupportingDocMasterId, String documentTye,
				String userType, String applicationType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisSupportingDocumentsMaster> orderByComparator)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Removes all the cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63; from the database.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 */
	public void removeBygetSupportingDocApplicant(
		String documentTye, String userType, String applicationType);

	/**
	 * Returns the number of cannabis supporting documents masters where documentTye = &#63; and userType = &#63; and applicationType = &#63;.
	 *
	 * @param documentTye the document tye
	 * @param userType the user type
	 * @param applicationType the application type
	 * @return the number of matching cannabis supporting documents masters
	 */
	public int countBygetSupportingDocApplicant(
		String documentTye, String userType, String applicationType);

	/**
	 * Caches the cannabis supporting documents master in the entity cache if it is enabled.
	 *
	 * @param cannabisSupportingDocumentsMaster the cannabis supporting documents master
	 */
	public void cacheResult(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster);

	/**
	 * Caches the cannabis supporting documents masters in the entity cache if it is enabled.
	 *
	 * @param cannabisSupportingDocumentsMasters the cannabis supporting documents masters
	 */
	public void cacheResult(
		java.util.List<CannabisSupportingDocumentsMaster>
			cannabisSupportingDocumentsMasters);

	/**
	 * Creates a new cannabis supporting documents master with the primary key. Does not add the cannabis supporting documents master to the database.
	 *
	 * @param cannabisSupportingDocMasterId the primary key for the new cannabis supporting documents master
	 * @return the new cannabis supporting documents master
	 */
	public CannabisSupportingDocumentsMaster create(
		long cannabisSupportingDocMasterId);

	/**
	 * Removes the cannabis supporting documents master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master that was removed
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public CannabisSupportingDocumentsMaster remove(
			long cannabisSupportingDocMasterId)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	public CannabisSupportingDocumentsMaster updateImpl(
		CannabisSupportingDocumentsMaster cannabisSupportingDocumentsMaster);

	/**
	 * Returns the cannabis supporting documents master with the primary key or throws a <code>NoSuchCannabisSupportingDocumentsMasterException</code> if it could not be found.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master
	 * @throws NoSuchCannabisSupportingDocumentsMasterException if a cannabis supporting documents master with the primary key could not be found
	 */
	public CannabisSupportingDocumentsMaster findByPrimaryKey(
			long cannabisSupportingDocMasterId)
		throws NoSuchCannabisSupportingDocumentsMasterException;

	/**
	 * Returns the cannabis supporting documents master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisSupportingDocMasterId the primary key of the cannabis supporting documents master
	 * @return the cannabis supporting documents master, or <code>null</code> if a cannabis supporting documents master with the primary key could not be found
	 */
	public CannabisSupportingDocumentsMaster fetchByPrimaryKey(
		long cannabisSupportingDocMasterId);

	/**
	 * Returns all the cannabis supporting documents masters.
	 *
	 * @return the cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster> findAll();

	/**
	 * Returns a range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @return the range of cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupportingDocumentsMaster> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supporting documents masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupportingDocumentsMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supporting documents masters
	 * @param end the upper bound of the range of cannabis supporting documents masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis supporting documents masters
	 */
	public java.util.List<CannabisSupportingDocumentsMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupportingDocumentsMaster> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis supporting documents masters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis supporting documents masters.
	 *
	 * @return the number of cannabis supporting documents masters
	 */
	public int countAll();

}