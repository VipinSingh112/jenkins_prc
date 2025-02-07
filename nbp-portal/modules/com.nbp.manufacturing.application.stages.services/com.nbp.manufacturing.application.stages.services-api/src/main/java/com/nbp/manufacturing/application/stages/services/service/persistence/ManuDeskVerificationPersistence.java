/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManuDeskVerificationException;
import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface ManuDeskVerificationPersistence
	extends BasePersistence<ManuDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuDeskVerificationUtil} to access the manu desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
			findBygetManuDeskVerificationByStatus_ApplicationId_First(
				String status, long manufacturingApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the first manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
		fetchBygetManuDeskVerificationByStatus_ApplicationId_First(
			String status, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator);

	/**
	 * Returns the last manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
			findBygetManuDeskVerificationByStatus_ApplicationId_Last(
				String status, long manufacturingApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the last manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
		fetchBygetManuDeskVerificationByStatus_ApplicationId_Last(
			String status, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator);

	/**
	 * Returns the manu desk verifications before and after the current manu desk verification in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param manuDeskVerificationId the primary key of the current manu desk verification
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public ManuDeskVerification[]
			findBygetManuDeskVerificationByStatus_ApplicationId_PrevAndNext(
				long manuDeskVerificationId, String status,
				long manufacturingApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Removes all the manu desk verifications where status = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetManuDeskVerificationByStatus_ApplicationId(
		String status, long manufacturingApplicationId);

	/**
	 * Returns the number of manu desk verifications where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	public int countBygetManuDeskVerificationByStatus_ApplicationId(
		String status, long manufacturingApplicationId);

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuDeskVerificationException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification findBygetManufactuirngById(
			long manufacturingApplicationId)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification fetchBygetManufactuirngById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu desk verification where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification fetchBygetManufactuirngById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu desk verification where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu desk verification that was removed
	 */
	public ManuDeskVerification removeBygetManufactuirngById(
			long manufacturingApplicationId)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the number of manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	public int countBygetManufactuirngById(long manufacturingApplicationId);

	/**
	 * Returns all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu desk verifications
	 */
	public java.util.List<ManuDeskVerification>
		findBygetDeskVerificationManufactuirngById(
			long manufacturingApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
			findBygetDeskVerificationManufactuirngById_First(
				long manufacturingApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the first manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
		fetchBygetDeskVerificationManufactuirngById_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator);

	/**
	 * Returns the last manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification findBygetDeskVerificationManufactuirngById_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the last manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu desk verification, or <code>null</code> if a matching manu desk verification could not be found
	 */
	public ManuDeskVerification
		fetchBygetDeskVerificationManufactuirngById_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuDeskVerification> orderByComparator);

	/**
	 * Returns the manu desk verifications before and after the current manu desk verification in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuDeskVerificationId the primary key of the current manu desk verification
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public ManuDeskVerification[]
			findBygetDeskVerificationManufactuirngById_PrevAndNext(
				long manuDeskVerificationId, long manufacturingApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<ManuDeskVerification> orderByComparator)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Removes all the manu desk verifications where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetDeskVerificationManufactuirngById(
		long manufacturingApplicationId);

	/**
	 * Returns the number of manu desk verifications where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu desk verifications
	 */
	public int countBygetDeskVerificationManufactuirngById(
		long manufacturingApplicationId);

	/**
	 * Caches the manu desk verification in the entity cache if it is enabled.
	 *
	 * @param manuDeskVerification the manu desk verification
	 */
	public void cacheResult(ManuDeskVerification manuDeskVerification);

	/**
	 * Caches the manu desk verifications in the entity cache if it is enabled.
	 *
	 * @param manuDeskVerifications the manu desk verifications
	 */
	public void cacheResult(
		java.util.List<ManuDeskVerification> manuDeskVerifications);

	/**
	 * Creates a new manu desk verification with the primary key. Does not add the manu desk verification to the database.
	 *
	 * @param manuDeskVerificationId the primary key for the new manu desk verification
	 * @return the new manu desk verification
	 */
	public ManuDeskVerification create(long manuDeskVerificationId);

	/**
	 * Removes the manu desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification that was removed
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public ManuDeskVerification remove(long manuDeskVerificationId)
		throws NoSuchManuDeskVerificationException;

	public ManuDeskVerification updateImpl(
		ManuDeskVerification manuDeskVerification);

	/**
	 * Returns the manu desk verification with the primary key or throws a <code>NoSuchManuDeskVerificationException</code> if it could not be found.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification
	 * @throws NoSuchManuDeskVerificationException if a manu desk verification with the primary key could not be found
	 */
	public ManuDeskVerification findByPrimaryKey(long manuDeskVerificationId)
		throws NoSuchManuDeskVerificationException;

	/**
	 * Returns the manu desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification, or <code>null</code> if a manu desk verification with the primary key could not be found
	 */
	public ManuDeskVerification fetchByPrimaryKey(long manuDeskVerificationId);

	/**
	 * Returns all the manu desk verifications.
	 *
	 * @return the manu desk verifications
	 */
	public java.util.List<ManuDeskVerification> findAll();

	/**
	 * Returns a range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of manu desk verifications
	 */
	public java.util.List<ManuDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu desk verifications
	 */
	public java.util.List<ManuDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu desk verifications
	 */
	public java.util.List<ManuDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu desk verifications.
	 *
	 * @return the number of manu desk verifications
	 */
	public int countAll();

}