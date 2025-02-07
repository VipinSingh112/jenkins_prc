/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOSIServiceSupportingDocIndException;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi service supporting doc ind service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocIndUtil
 * @generated
 */
@ProviderType
public interface OSIServiceSupportingDocIndPersistence
	extends BasePersistence<OSIServiceSupportingDocInd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSIServiceSupportingDocIndUtil} to access the osi service supporting doc ind persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceSupportingDocIndException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a matching osi service supporting doc ind could not be found
	 */
	public OSIServiceSupportingDocInd findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceSupportingDocIndException;

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service supporting doc ind, or <code>null</code> if a matching osi service supporting doc ind could not be found
	 */
	public OSIServiceSupportingDocInd fetchBygetOSIService_ById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service supporting doc ind, or <code>null</code> if a matching osi service supporting doc ind could not be found
	 */
	public OSIServiceSupportingDocInd fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi service supporting doc ind where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service supporting doc ind that was removed
	 */
	public OSIServiceSupportingDocInd removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceSupportingDocIndException;

	/**
	 * Returns the number of osi service supporting doc inds where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service supporting doc inds
	 */
	public int countBygetOSIService_ById(long osiServicesApplicationId);

	/**
	 * Caches the osi service supporting doc ind in the entity cache if it is enabled.
	 *
	 * @param osiServiceSupportingDocInd the osi service supporting doc ind
	 */
	public void cacheResult(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd);

	/**
	 * Caches the osi service supporting doc inds in the entity cache if it is enabled.
	 *
	 * @param osiServiceSupportingDocInds the osi service supporting doc inds
	 */
	public void cacheResult(
		java.util.List<OSIServiceSupportingDocInd> osiServiceSupportingDocInds);

	/**
	 * Creates a new osi service supporting doc ind with the primary key. Does not add the osi service supporting doc ind to the database.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key for the new osi service supporting doc ind
	 * @return the new osi service supporting doc ind
	 */
	public OSIServiceSupportingDocInd create(long oSIServiceSupportingDocIndId);

	/**
	 * Removes the osi service supporting doc ind with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was removed
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	public OSIServiceSupportingDocInd remove(long oSIServiceSupportingDocIndId)
		throws NoSuchOSIServiceSupportingDocIndException;

	public OSIServiceSupportingDocInd updateImpl(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd);

	/**
	 * Returns the osi service supporting doc ind with the primary key or throws a <code>NoSuchOSIServiceSupportingDocIndException</code> if it could not be found.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	public OSIServiceSupportingDocInd findByPrimaryKey(
			long oSIServiceSupportingDocIndId)
		throws NoSuchOSIServiceSupportingDocIndException;

	/**
	 * Returns the osi service supporting doc ind with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind, or <code>null</code> if a osi service supporting doc ind with the primary key could not be found
	 */
	public OSIServiceSupportingDocInd fetchByPrimaryKey(
		long oSIServiceSupportingDocIndId);

	/**
	 * Returns all the osi service supporting doc inds.
	 *
	 * @return the osi service supporting doc inds
	 */
	public java.util.List<OSIServiceSupportingDocInd> findAll();

	/**
	 * Returns a range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @return the range of osi service supporting doc inds
	 */
	public java.util.List<OSIServiceSupportingDocInd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service supporting doc inds
	 */
	public java.util.List<OSIServiceSupportingDocInd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OSIServiceSupportingDocInd> orderByComparator);

	/**
	 * Returns an ordered range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service supporting doc inds
	 */
	public java.util.List<OSIServiceSupportingDocInd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OSIServiceSupportingDocInd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi service supporting doc inds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi service supporting doc inds.
	 *
	 * @return the number of osi service supporting doc inds
	 */
	public int countAll();

}