/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoryPaymentVerificationException;
import com.nbp.factories.registration.stage.services.model.FactoryPaymentVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factory payment verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerificationUtil
 * @generated
 */
@ProviderType
public interface FactoryPaymentVerificationPersistence
	extends BasePersistence<FactoryPaymentVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoryPaymentVerificationUtil} to access the factory payment verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factory payment verification where caseId = &#63; or throws a <code>NoSuchFactoryPaymentVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification findBygetFactoryPaymentConfBy_CI(
			String caseId)
		throws NoSuchFactoryPaymentVerificationException;

	/**
	 * Returns the factory payment verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification fetchBygetFactoryPaymentConfBy_CI(
		String caseId);

	/**
	 * Returns the factory payment verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification fetchBygetFactoryPaymentConfBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the factory payment verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factory payment verification that was removed
	 */
	public FactoryPaymentVerification removeBygetFactoryPaymentConfBy_CI(
			String caseId)
		throws NoSuchFactoryPaymentVerificationException;

	/**
	 * Returns the number of factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factory payment verifications
	 */
	public int countBygetFactoryPaymentConfBy_CI(String caseId);

	/**
	 * Returns all the factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification>
		findBygetFactoryPayConfBy_CI(String caseId);

	/**
	 * Returns a range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of matching factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification>
		findBygetFactoryPayConfBy_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification>
		findBygetFactoryPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoryPaymentVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification>
		findBygetFactoryPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoryPaymentVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification findBygetFactoryPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoryPaymentVerification> orderByComparator)
		throws NoSuchFactoryPaymentVerificationException;

	/**
	 * Returns the first factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification fetchBygetFactoryPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoryPaymentVerification> orderByComparator);

	/**
	 * Returns the last factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification findBygetFactoryPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoryPaymentVerification> orderByComparator)
		throws NoSuchFactoryPaymentVerificationException;

	/**
	 * Returns the last factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public FactoryPaymentVerification fetchBygetFactoryPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoryPaymentVerification> orderByComparator);

	/**
	 * Returns the factory payment verifications before and after the current factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param factoryPaymentVerificationId the primary key of the current factory payment verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	public FactoryPaymentVerification[]
			findBygetFactoryPayConfBy_CI_PrevAndNext(
				long factoryPaymentVerificationId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FactoryPaymentVerification> orderByComparator)
		throws NoSuchFactoryPaymentVerificationException;

	/**
	 * Removes all the factory payment verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFactoryPayConfBy_CI(String caseId);

	/**
	 * Returns the number of factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factory payment verifications
	 */
	public int countBygetFactoryPayConfBy_CI(String caseId);

	/**
	 * Caches the factory payment verification in the entity cache if it is enabled.
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 */
	public void cacheResult(
		FactoryPaymentVerification factoryPaymentVerification);

	/**
	 * Caches the factory payment verifications in the entity cache if it is enabled.
	 *
	 * @param factoryPaymentVerifications the factory payment verifications
	 */
	public void cacheResult(
		java.util.List<FactoryPaymentVerification> factoryPaymentVerifications);

	/**
	 * Creates a new factory payment verification with the primary key. Does not add the factory payment verification to the database.
	 *
	 * @param factoryPaymentVerificationId the primary key for the new factory payment verification
	 * @return the new factory payment verification
	 */
	public FactoryPaymentVerification create(long factoryPaymentVerificationId);

	/**
	 * Removes the factory payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification that was removed
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	public FactoryPaymentVerification remove(long factoryPaymentVerificationId)
		throws NoSuchFactoryPaymentVerificationException;

	public FactoryPaymentVerification updateImpl(
		FactoryPaymentVerification factoryPaymentVerification);

	/**
	 * Returns the factory payment verification with the primary key or throws a <code>NoSuchFactoryPaymentVerificationException</code> if it could not be found.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	public FactoryPaymentVerification findByPrimaryKey(
			long factoryPaymentVerificationId)
		throws NoSuchFactoryPaymentVerificationException;

	/**
	 * Returns the factory payment verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification, or <code>null</code> if a factory payment verification with the primary key could not be found
	 */
	public FactoryPaymentVerification fetchByPrimaryKey(
		long factoryPaymentVerificationId);

	/**
	 * Returns all the factory payment verifications.
	 *
	 * @return the factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification> findAll();

	/**
	 * Returns a range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoryPaymentVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factory payment verifications
	 */
	public java.util.List<FactoryPaymentVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoryPaymentVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factory payment verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factory payment verifications.
	 *
	 * @return the number of factory payment verifications
	 */
	public int countAll();

}