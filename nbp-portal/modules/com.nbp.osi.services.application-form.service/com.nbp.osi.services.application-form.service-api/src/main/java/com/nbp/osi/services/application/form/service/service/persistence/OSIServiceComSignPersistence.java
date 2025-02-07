/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOSIServiceComSignException;
import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi service com sign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSignUtil
 * @generated
 */
@ProviderType
public interface OSIServiceComSignPersistence
	extends BasePersistence<OSIServiceComSign> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSIServiceComSignUtil} to access the osi service com sign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceComSignException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a matching osi service com sign could not be found
	 */
	public OSIServiceComSign findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceComSignException;

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service com sign, or <code>null</code> if a matching osi service com sign could not be found
	 */
	public OSIServiceComSign fetchBygetOSIService_ById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service com sign, or <code>null</code> if a matching osi service com sign could not be found
	 */
	public OSIServiceComSign fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi service com sign where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service com sign that was removed
	 */
	public OSIServiceComSign removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceComSignException;

	/**
	 * Returns the number of osi service com signs where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service com signs
	 */
	public int countBygetOSIService_ById(long osiServicesApplicationId);

	/**
	 * Caches the osi service com sign in the entity cache if it is enabled.
	 *
	 * @param osiServiceComSign the osi service com sign
	 */
	public void cacheResult(OSIServiceComSign osiServiceComSign);

	/**
	 * Caches the osi service com signs in the entity cache if it is enabled.
	 *
	 * @param osiServiceComSigns the osi service com signs
	 */
	public void cacheResult(
		java.util.List<OSIServiceComSign> osiServiceComSigns);

	/**
	 * Creates a new osi service com sign with the primary key. Does not add the osi service com sign to the database.
	 *
	 * @param osiComSignId the primary key for the new osi service com sign
	 * @return the new osi service com sign
	 */
	public OSIServiceComSign create(long osiComSignId);

	/**
	 * Removes the osi service com sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign that was removed
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	public OSIServiceComSign remove(long osiComSignId)
		throws NoSuchOSIServiceComSignException;

	public OSIServiceComSign updateImpl(OSIServiceComSign osiServiceComSign);

	/**
	 * Returns the osi service com sign with the primary key or throws a <code>NoSuchOSIServiceComSignException</code> if it could not be found.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	public OSIServiceComSign findByPrimaryKey(long osiComSignId)
		throws NoSuchOSIServiceComSignException;

	/**
	 * Returns the osi service com sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign, or <code>null</code> if a osi service com sign with the primary key could not be found
	 */
	public OSIServiceComSign fetchByPrimaryKey(long osiComSignId);

	/**
	 * Returns all the osi service com signs.
	 *
	 * @return the osi service com signs
	 */
	public java.util.List<OSIServiceComSign> findAll();

	/**
	 * Returns a range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @return the range of osi service com signs
	 */
	public java.util.List<OSIServiceComSign> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service com signs
	 */
	public java.util.List<OSIServiceComSign> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceComSign>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service com signs
	 */
	public java.util.List<OSIServiceComSign> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceComSign>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi service com signs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi service com signs.
	 *
	 * @return the number of osi service com signs
	 */
	public int countAll();

}