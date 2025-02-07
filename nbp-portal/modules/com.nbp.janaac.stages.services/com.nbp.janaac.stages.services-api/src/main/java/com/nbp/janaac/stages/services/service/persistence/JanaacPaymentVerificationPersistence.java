/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.stages.services.exception.NoSuchJanaacPaymentVerificationException;
import com.nbp.janaac.stages.services.model.JanaacPaymentVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac payment verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacPaymentVerificationUtil
 * @generated
 */
@ProviderType
public interface JanaacPaymentVerificationPersistence
	extends BasePersistence<JanaacPaymentVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacPaymentVerificationUtil} to access the janaac payment verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the janaac payment verification where caseId = &#63; or throws a <code>NoSuchJanaacPaymentVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification findBygetJanaacPaymentBy_CI(String caseId)
		throws NoSuchJanaacPaymentVerificationException;

	/**
	 * Returns the janaac payment verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification fetchBygetJanaacPaymentBy_CI(
		String caseId);

	/**
	 * Returns the janaac payment verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification fetchBygetJanaacPaymentBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the janaac payment verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac payment verification that was removed
	 */
	public JanaacPaymentVerification removeBygetJanaacPaymentBy_CI(
			String caseId)
		throws NoSuchJanaacPaymentVerificationException;

	/**
	 * Returns the number of janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac payment verifications
	 */
	public int countBygetJanaacPaymentBy_CI(String caseId);

	/**
	 * Returns all the janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification>
		findBygetJanaacPayConfBy_CI(String caseId);

	/**
	 * Returns a range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of matching janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification>
		findBygetJanaacPayConfBy_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification>
		findBygetJanaacPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacPaymentVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification>
		findBygetJanaacPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacPaymentVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification findBygetJanaacPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacPaymentVerification> orderByComparator)
		throws NoSuchJanaacPaymentVerificationException;

	/**
	 * Returns the first janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification fetchBygetJanaacPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacPaymentVerification> orderByComparator);

	/**
	 * Returns the last janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification findBygetJanaacPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacPaymentVerification> orderByComparator)
		throws NoSuchJanaacPaymentVerificationException;

	/**
	 * Returns the last janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public JanaacPaymentVerification fetchBygetJanaacPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacPaymentVerification> orderByComparator);

	/**
	 * Returns the janaac payment verifications before and after the current janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param janaacPaymentVerificationId the primary key of the current janaac payment verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	public JanaacPaymentVerification[] findBygetJanaacPayConfBy_CI_PrevAndNext(
			long janaacPaymentVerificationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacPaymentVerification> orderByComparator)
		throws NoSuchJanaacPaymentVerificationException;

	/**
	 * Removes all the janaac payment verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJanaacPayConfBy_CI(String caseId);

	/**
	 * Returns the number of janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac payment verifications
	 */
	public int countBygetJanaacPayConfBy_CI(String caseId);

	/**
	 * Caches the janaac payment verification in the entity cache if it is enabled.
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 */
	public void cacheResult(
		JanaacPaymentVerification janaacPaymentVerification);

	/**
	 * Caches the janaac payment verifications in the entity cache if it is enabled.
	 *
	 * @param janaacPaymentVerifications the janaac payment verifications
	 */
	public void cacheResult(
		java.util.List<JanaacPaymentVerification> janaacPaymentVerifications);

	/**
	 * Creates a new janaac payment verification with the primary key. Does not add the janaac payment verification to the database.
	 *
	 * @param janaacPaymentVerificationId the primary key for the new janaac payment verification
	 * @return the new janaac payment verification
	 */
	public JanaacPaymentVerification create(long janaacPaymentVerificationId);

	/**
	 * Removes the janaac payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification that was removed
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	public JanaacPaymentVerification remove(long janaacPaymentVerificationId)
		throws NoSuchJanaacPaymentVerificationException;

	public JanaacPaymentVerification updateImpl(
		JanaacPaymentVerification janaacPaymentVerification);

	/**
	 * Returns the janaac payment verification with the primary key or throws a <code>NoSuchJanaacPaymentVerificationException</code> if it could not be found.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	public JanaacPaymentVerification findByPrimaryKey(
			long janaacPaymentVerificationId)
		throws NoSuchJanaacPaymentVerificationException;

	/**
	 * Returns the janaac payment verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification, or <code>null</code> if a janaac payment verification with the primary key could not be found
	 */
	public JanaacPaymentVerification fetchByPrimaryKey(
		long janaacPaymentVerificationId);

	/**
	 * Returns all the janaac payment verifications.
	 *
	 * @return the janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification> findAll();

	/**
	 * Returns a range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacPaymentVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac payment verifications
	 */
	public java.util.List<JanaacPaymentVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacPaymentVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac payment verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac payment verifications.
	 *
	 * @return the number of janaac payment verifications
	 */
	public int countAll();

}