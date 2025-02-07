/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevGeneralBusinessIfoException;
import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev general business ifo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfoUtil
 * @generated
 */
@ProviderType
public interface SezDevGeneralBusinessIfoPersistence
	extends BasePersistence<SezDevGeneralBusinessIfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevGeneralBusinessIfoUtil} to access the sez dev general business ifo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevGeneralBusinessIfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a matching sez dev general business ifo could not be found
	 */
	public SezDevGeneralBusinessIfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevGeneralBusinessIfoException;

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev general business ifo, or <code>null</code> if a matching sez dev general business ifo could not be found
	 */
	public SezDevGeneralBusinessIfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev general business ifo, or <code>null</code> if a matching sez dev general business ifo could not be found
	 */
	public SezDevGeneralBusinessIfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez dev general business ifo where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev general business ifo that was removed
	 */
	public SezDevGeneralBusinessIfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevGeneralBusinessIfoException;

	/**
	 * Returns the number of sez dev general business ifos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev general business ifos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev general business ifo in the entity cache if it is enabled.
	 *
	 * @param sezDevGeneralBusinessIfo the sez dev general business ifo
	 */
	public void cacheResult(SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo);

	/**
	 * Caches the sez dev general business ifos in the entity cache if it is enabled.
	 *
	 * @param sezDevGeneralBusinessIfos the sez dev general business ifos
	 */
	public void cacheResult(
		java.util.List<SezDevGeneralBusinessIfo> sezDevGeneralBusinessIfos);

	/**
	 * Creates a new sez dev general business ifo with the primary key. Does not add the sez dev general business ifo to the database.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key for the new sez dev general business ifo
	 * @return the new sez dev general business ifo
	 */
	public SezDevGeneralBusinessIfo create(long sezDevGeneralBusinessIfoId);

	/**
	 * Removes the sez dev general business ifo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo that was removed
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	public SezDevGeneralBusinessIfo remove(long sezDevGeneralBusinessIfoId)
		throws NoSuchSezDevGeneralBusinessIfoException;

	public SezDevGeneralBusinessIfo updateImpl(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo);

	/**
	 * Returns the sez dev general business ifo with the primary key or throws a <code>NoSuchSezDevGeneralBusinessIfoException</code> if it could not be found.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	public SezDevGeneralBusinessIfo findByPrimaryKey(
			long sezDevGeneralBusinessIfoId)
		throws NoSuchSezDevGeneralBusinessIfoException;

	/**
	 * Returns the sez dev general business ifo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo, or <code>null</code> if a sez dev general business ifo with the primary key could not be found
	 */
	public SezDevGeneralBusinessIfo fetchByPrimaryKey(
		long sezDevGeneralBusinessIfoId);

	/**
	 * Returns all the sez dev general business ifos.
	 *
	 * @return the sez dev general business ifos
	 */
	public java.util.List<SezDevGeneralBusinessIfo> findAll();

	/**
	 * Returns a range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @return the range of sez dev general business ifos
	 */
	public java.util.List<SezDevGeneralBusinessIfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev general business ifos
	 */
	public java.util.List<SezDevGeneralBusinessIfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGeneralBusinessIfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev general business ifos
	 */
	public java.util.List<SezDevGeneralBusinessIfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevGeneralBusinessIfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev general business ifos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev general business ifos.
	 *
	 * @return the number of sez dev general business ifos
	 */
	public int countAll();

}