/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchBrokerRegistrationInfoException;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the broker registration info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfoUtil
 * @generated
 */
@ProviderType
public interface BrokerRegistrationInfoPersistence
	extends BasePersistence<BrokerRegistrationInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BrokerRegistrationInfoUtil} to access the broker registration info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or throws a <code>NoSuchBrokerRegistrationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a matching broker registration info could not be found
	 */
	public BrokerRegistrationInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchBrokerRegistrationInfoException;

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker registration info, or <code>null</code> if a matching broker registration info could not be found
	 */
	public BrokerRegistrationInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching broker registration info, or <code>null</code> if a matching broker registration info could not be found
	 */
	public BrokerRegistrationInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the broker registration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the broker registration info that was removed
	 */
	public BrokerRegistrationInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchBrokerRegistrationInfoException;

	/**
	 * Returns the number of broker registration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching broker registration infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the broker registration info in the entity cache if it is enabled.
	 *
	 * @param brokerRegistrationInfo the broker registration info
	 */
	public void cacheResult(BrokerRegistrationInfo brokerRegistrationInfo);

	/**
	 * Caches the broker registration infos in the entity cache if it is enabled.
	 *
	 * @param brokerRegistrationInfos the broker registration infos
	 */
	public void cacheResult(
		java.util.List<BrokerRegistrationInfo> brokerRegistrationInfos);

	/**
	 * Creates a new broker registration info with the primary key. Does not add the broker registration info to the database.
	 *
	 * @param brokerRegstInfoId the primary key for the new broker registration info
	 * @return the new broker registration info
	 */
	public BrokerRegistrationInfo create(long brokerRegstInfoId);

	/**
	 * Removes the broker registration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info that was removed
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	public BrokerRegistrationInfo remove(long brokerRegstInfoId)
		throws NoSuchBrokerRegistrationInfoException;

	public BrokerRegistrationInfo updateImpl(
		BrokerRegistrationInfo brokerRegistrationInfo);

	/**
	 * Returns the broker registration info with the primary key or throws a <code>NoSuchBrokerRegistrationInfoException</code> if it could not be found.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	public BrokerRegistrationInfo findByPrimaryKey(long brokerRegstInfoId)
		throws NoSuchBrokerRegistrationInfoException;

	/**
	 * Returns the broker registration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info, or <code>null</code> if a broker registration info with the primary key could not be found
	 */
	public BrokerRegistrationInfo fetchByPrimaryKey(long brokerRegstInfoId);

	/**
	 * Returns all the broker registration infos.
	 *
	 * @return the broker registration infos
	 */
	public java.util.List<BrokerRegistrationInfo> findAll();

	/**
	 * Returns a range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @return the range of broker registration infos
	 */
	public java.util.List<BrokerRegistrationInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of broker registration infos
	 */
	public java.util.List<BrokerRegistrationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BrokerRegistrationInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of broker registration infos
	 */
	public java.util.List<BrokerRegistrationInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BrokerRegistrationInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the broker registration infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of broker registration infos.
	 *
	 * @return the number of broker registration infos
	 */
	public int countAll();

}