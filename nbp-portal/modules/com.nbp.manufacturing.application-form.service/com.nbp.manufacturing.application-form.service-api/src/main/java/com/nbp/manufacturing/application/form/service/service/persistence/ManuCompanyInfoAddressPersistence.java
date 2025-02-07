/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuCompanyInfoAddressException;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu company info address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddressUtil
 * @generated
 */
@ProviderType
public interface ManuCompanyInfoAddressPersistence
	extends BasePersistence<ManuCompanyInfoAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuCompanyInfoAddressUtil} to access the manu company info address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress findBygetMA_CIA_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Returns the first manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress fetchBygetMA_CIA_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns the last manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress findBygetMA_CIA_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Returns the last manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress fetchBygetMA_CIA_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns the manu company info addresses before and after the current manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the current manu company info address
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public ManuCompanyInfoAddress[] findBygetMA_CIA_PrevAndNext(
			long manuCompanyInfoAddressId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Removes all the manu company info addresses where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_CIA(long manufacturingApplicationId);

	/**
	 * Returns the number of manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company info addresses
	 */
	public int countBygetMA_CIA(long manufacturingApplicationId);

	/**
	 * Returns all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @return the matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId);

	/**
	 * Returns a range of all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end);

	/**
	 * Returns an ordered range of all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress findBygetMA_CII_First(
			long manuCompanyInfoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Returns the first manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress fetchBygetMA_CII_First(
		long manuCompanyInfoId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns the last manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress findBygetMA_CII_Last(
			long manuCompanyInfoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Returns the last manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public ManuCompanyInfoAddress fetchBygetMA_CII_Last(
		long manuCompanyInfoId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns the manu company info addresses before and after the current manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the current manu company info address
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public ManuCompanyInfoAddress[] findBygetMA_CII_PrevAndNext(
			long manuCompanyInfoAddressId, long manuCompanyInfoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Removes all the manu company info addresses where manuCompanyInfoId = &#63; from the database.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 */
	public void removeBygetMA_CII(long manuCompanyInfoId);

	/**
	 * Returns the number of manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @return the number of matching manu company info addresses
	 */
	public int countBygetMA_CII(long manuCompanyInfoId);

	/**
	 * Caches the manu company info address in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 */
	public void cacheResult(ManuCompanyInfoAddress manuCompanyInfoAddress);

	/**
	 * Caches the manu company info addresses in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfoAddresses the manu company info addresses
	 */
	public void cacheResult(
		java.util.List<ManuCompanyInfoAddress> manuCompanyInfoAddresses);

	/**
	 * Creates a new manu company info address with the primary key. Does not add the manu company info address to the database.
	 *
	 * @param manuCompanyInfoAddressId the primary key for the new manu company info address
	 * @return the new manu company info address
	 */
	public ManuCompanyInfoAddress create(long manuCompanyInfoAddressId);

	/**
	 * Removes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public ManuCompanyInfoAddress remove(long manuCompanyInfoAddressId)
		throws NoSuchManuCompanyInfoAddressException;

	public ManuCompanyInfoAddress updateImpl(
		ManuCompanyInfoAddress manuCompanyInfoAddress);

	/**
	 * Returns the manu company info address with the primary key or throws a <code>NoSuchManuCompanyInfoAddressException</code> if it could not be found.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public ManuCompanyInfoAddress findByPrimaryKey(
			long manuCompanyInfoAddressId)
		throws NoSuchManuCompanyInfoAddressException;

	/**
	 * Returns the manu company info address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address, or <code>null</code> if a manu company info address with the primary key could not be found
	 */
	public ManuCompanyInfoAddress fetchByPrimaryKey(
		long manuCompanyInfoAddressId);

	/**
	 * Returns all the manu company info addresses.
	 *
	 * @return the manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findAll();

	/**
	 * Returns a range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu company info addresses
	 */
	public java.util.List<ManuCompanyInfoAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuCompanyInfoAddress>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu company info addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu company info addresses.
	 *
	 * @return the number of manu company info addresses
	 */
	public int countAll();

}