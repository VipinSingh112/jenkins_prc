/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewGroundSignatureException;
import com.nbp.tourism.application.form.services.model.TourismNewGroundSignature;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new ground signature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundSignatureUtil
 * @generated
 */
@ProviderType
public interface TourismNewGroundSignaturePersistence
	extends BasePersistence<TourismNewGroundSignature> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewGroundSignatureUtil} to access the tourism new ground signature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewGroundSignatureException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a matching tourism new ground signature could not be found
	 */
	public TourismNewGroundSignature findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewGroundSignatureException;

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground signature, or <code>null</code> if a matching tourism new ground signature could not be found
	 */
	public TourismNewGroundSignature fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new ground signature, or <code>null</code> if a matching tourism new ground signature could not be found
	 */
	public TourismNewGroundSignature fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new ground signature where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new ground signature that was removed
	 */
	public TourismNewGroundSignature removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewGroundSignatureException;

	/**
	 * Returns the number of tourism new ground signatures where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new ground signatures
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new ground signature in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundSignature the tourism new ground signature
	 */
	public void cacheResult(
		TourismNewGroundSignature tourismNewGroundSignature);

	/**
	 * Caches the tourism new ground signatures in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundSignatures the tourism new ground signatures
	 */
	public void cacheResult(
		java.util.List<TourismNewGroundSignature> tourismNewGroundSignatures);

	/**
	 * Creates a new tourism new ground signature with the primary key. Does not add the tourism new ground signature to the database.
	 *
	 * @param TourismNewGroundSignatureId the primary key for the new tourism new ground signature
	 * @return the new tourism new ground signature
	 */
	public TourismNewGroundSignature create(long TourismNewGroundSignatureId);

	/**
	 * Removes the tourism new ground signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature that was removed
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	public TourismNewGroundSignature remove(long TourismNewGroundSignatureId)
		throws NoSuchTourismNewGroundSignatureException;

	public TourismNewGroundSignature updateImpl(
		TourismNewGroundSignature tourismNewGroundSignature);

	/**
	 * Returns the tourism new ground signature with the primary key or throws a <code>NoSuchTourismNewGroundSignatureException</code> if it could not be found.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	public TourismNewGroundSignature findByPrimaryKey(
			long TourismNewGroundSignatureId)
		throws NoSuchTourismNewGroundSignatureException;

	/**
	 * Returns the tourism new ground signature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature, or <code>null</code> if a tourism new ground signature with the primary key could not be found
	 */
	public TourismNewGroundSignature fetchByPrimaryKey(
		long TourismNewGroundSignatureId);

	/**
	 * Returns all the tourism new ground signatures.
	 *
	 * @return the tourism new ground signatures
	 */
	public java.util.List<TourismNewGroundSignature> findAll();

	/**
	 * Returns a range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @return the range of tourism new ground signatures
	 */
	public java.util.List<TourismNewGroundSignature> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new ground signatures
	 */
	public java.util.List<TourismNewGroundSignature> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewGroundSignature> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new ground signatures
	 */
	public java.util.List<TourismNewGroundSignature> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewGroundSignature> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new ground signatures from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new ground signatures.
	 *
	 * @return the number of tourism new ground signatures
	 */
	public int countAll();

}