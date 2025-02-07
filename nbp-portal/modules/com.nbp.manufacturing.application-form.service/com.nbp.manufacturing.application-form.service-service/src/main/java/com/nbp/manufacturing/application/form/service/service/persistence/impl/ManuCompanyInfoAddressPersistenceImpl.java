/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuCompanyInfoAddressException;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;
import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddressTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoAddressPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoAddressUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the manu company info address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuCompanyInfoAddressPersistence.class)
public class ManuCompanyInfoAddressPersistenceImpl
	extends BasePersistenceImpl<ManuCompanyInfoAddress>
	implements ManuCompanyInfoAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuCompanyInfoAddressUtil</code> to access the manu company info address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuCompanyInfoAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMA_CIA;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_CIA;
	private FinderPath _finderPathCountBygetMA_CIA;

	/**
	 * Returns all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info addresses
	 */
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId) {

		return findBygetMA_CIA(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_CIA(manufacturingApplicationId, start, end, null);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return findBygetMA_CIA(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_CIA;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_CIA;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuCompanyInfoAddress> list = null;

		if (useFinderCache) {
			list = (List<ManuCompanyInfoAddress>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuCompanyInfoAddress manuCompanyInfoAddress : list) {
					if (manufacturingApplicationId !=
							manuCompanyInfoAddress.
								getManufacturingApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MANUCOMPANYINFOADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CIA_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuCompanyInfoAddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuCompanyInfoAddress>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress findBygetMA_CIA_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = fetchBygetMA_CIA_First(
			manufacturingApplicationId, orderByComparator);

		if (manuCompanyInfoAddress != null) {
			return manuCompanyInfoAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuCompanyInfoAddressException(sb.toString());
	}

	/**
	 * Returns the first manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress fetchBygetMA_CIA_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		List<ManuCompanyInfoAddress> list = findBygetMA_CIA(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress findBygetMA_CIA_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = fetchBygetMA_CIA_Last(
			manufacturingApplicationId, orderByComparator);

		if (manuCompanyInfoAddress != null) {
			return manuCompanyInfoAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuCompanyInfoAddressException(sb.toString());
	}

	/**
	 * Returns the last manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress fetchBygetMA_CIA_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		int count = countBygetMA_CIA(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuCompanyInfoAddress> list = findBygetMA_CIA(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu company info addresses before and after the current manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the current manu company info address
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress[] findBygetMA_CIA_PrevAndNext(
			long manuCompanyInfoAddressId, long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = findByPrimaryKey(
			manuCompanyInfoAddressId);

		Session session = null;

		try {
			session = openSession();

			ManuCompanyInfoAddress[] array = new ManuCompanyInfoAddressImpl[3];

			array[0] = getBygetMA_CIA_PrevAndNext(
				session, manuCompanyInfoAddress, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuCompanyInfoAddress;

			array[2] = getBygetMA_CIA_PrevAndNext(
				session, manuCompanyInfoAddress, manufacturingApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuCompanyInfoAddress getBygetMA_CIA_PrevAndNext(
		Session session, ManuCompanyInfoAddress manuCompanyInfoAddress,
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUCOMPANYINFOADDRESS_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_CIA_MANUFACTURINGAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ManuCompanyInfoAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuCompanyInfoAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuCompanyInfoAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu company info addresses where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_CIA(long manufacturingApplicationId) {
		for (ManuCompanyInfoAddress manuCompanyInfoAddress :
				findBygetMA_CIA(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuCompanyInfoAddress);
		}
	}

	/**
	 * Returns the number of manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company info addresses
	 */
	@Override
	public int countBygetMA_CIA(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_CIA;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUCOMPANYINFOADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CIA_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMA_CIA_MANUFACTURINGAPPLICATIONID_2 =
			"manuCompanyInfoAddress.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_CII;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_CII;
	private FinderPath _finderPathCountBygetMA_CII;

	/**
	 * Returns all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @return the matching manu company info addresses
	 */
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId) {

		return findBygetMA_CII(
			manuCompanyInfoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end) {

		return findBygetMA_CII(manuCompanyInfoId, start, end, null);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return findBygetMA_CII(
			manuCompanyInfoId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_CII;
				finderArgs = new Object[] {manuCompanyInfoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_CII;
			finderArgs = new Object[] {
				manuCompanyInfoId, start, end, orderByComparator
			};
		}

		List<ManuCompanyInfoAddress> list = null;

		if (useFinderCache) {
			list = (List<ManuCompanyInfoAddress>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuCompanyInfoAddress manuCompanyInfoAddress : list) {
					if (manuCompanyInfoId !=
							manuCompanyInfoAddress.getManuCompanyInfoId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MANUCOMPANYINFOADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CII_MANUCOMPANYINFOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuCompanyInfoAddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manuCompanyInfoId);

				list = (List<ManuCompanyInfoAddress>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress findBygetMA_CII_First(
			long manuCompanyInfoId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = fetchBygetMA_CII_First(
			manuCompanyInfoId, orderByComparator);

		if (manuCompanyInfoAddress != null) {
			return manuCompanyInfoAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manuCompanyInfoId=");
		sb.append(manuCompanyInfoId);

		sb.append("}");

		throw new NoSuchManuCompanyInfoAddressException(sb.toString());
	}

	/**
	 * Returns the first manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress fetchBygetMA_CII_First(
		long manuCompanyInfoId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		List<ManuCompanyInfoAddress> list = findBygetMA_CII(
			manuCompanyInfoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress findBygetMA_CII_Last(
			long manuCompanyInfoId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = fetchBygetMA_CII_Last(
			manuCompanyInfoId, orderByComparator);

		if (manuCompanyInfoAddress != null) {
			return manuCompanyInfoAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manuCompanyInfoId=");
		sb.append(manuCompanyInfoId);

		sb.append("}");

		throw new NoSuchManuCompanyInfoAddressException(sb.toString());
	}

	/**
	 * Returns the last manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	@Override
	public ManuCompanyInfoAddress fetchBygetMA_CII_Last(
		long manuCompanyInfoId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		int count = countBygetMA_CII(manuCompanyInfoId);

		if (count == 0) {
			return null;
		}

		List<ManuCompanyInfoAddress> list = findBygetMA_CII(
			manuCompanyInfoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu company info addresses before and after the current manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the current manu company info address
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress[] findBygetMA_CII_PrevAndNext(
			long manuCompanyInfoAddressId, long manuCompanyInfoId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = findByPrimaryKey(
			manuCompanyInfoAddressId);

		Session session = null;

		try {
			session = openSession();

			ManuCompanyInfoAddress[] array = new ManuCompanyInfoAddressImpl[3];

			array[0] = getBygetMA_CII_PrevAndNext(
				session, manuCompanyInfoAddress, manuCompanyInfoId,
				orderByComparator, true);

			array[1] = manuCompanyInfoAddress;

			array[2] = getBygetMA_CII_PrevAndNext(
				session, manuCompanyInfoAddress, manuCompanyInfoId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ManuCompanyInfoAddress getBygetMA_CII_PrevAndNext(
		Session session, ManuCompanyInfoAddress manuCompanyInfoAddress,
		long manuCompanyInfoId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MANUCOMPANYINFOADDRESS_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_CII_MANUCOMPANYINFOID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ManuCompanyInfoAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manuCompanyInfoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuCompanyInfoAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuCompanyInfoAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu company info addresses where manuCompanyInfoId = &#63; from the database.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 */
	@Override
	public void removeBygetMA_CII(long manuCompanyInfoId) {
		for (ManuCompanyInfoAddress manuCompanyInfoAddress :
				findBygetMA_CII(
					manuCompanyInfoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(manuCompanyInfoAddress);
		}
	}

	/**
	 * Returns the number of manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @return the number of matching manu company info addresses
	 */
	@Override
	public int countBygetMA_CII(long manuCompanyInfoId) {
		FinderPath finderPath = _finderPathCountBygetMA_CII;

		Object[] finderArgs = new Object[] {manuCompanyInfoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUCOMPANYINFOADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_CII_MANUCOMPANYINFOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manuCompanyInfoId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETMA_CII_MANUCOMPANYINFOID_2 =
		"manuCompanyInfoAddress.manuCompanyInfoId = ?";

	public ManuCompanyInfoAddressPersistenceImpl() {
		setModelClass(ManuCompanyInfoAddress.class);

		setModelImplClass(ManuCompanyInfoAddressImpl.class);
		setModelPKClass(long.class);

		setTable(ManuCompanyInfoAddressTable.INSTANCE);
	}

	/**
	 * Caches the manu company info address in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 */
	@Override
	public void cacheResult(ManuCompanyInfoAddress manuCompanyInfoAddress) {
		entityCache.putResult(
			ManuCompanyInfoAddressImpl.class,
			manuCompanyInfoAddress.getPrimaryKey(), manuCompanyInfoAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu company info addresses in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfoAddresses the manu company info addresses
	 */
	@Override
	public void cacheResult(
		List<ManuCompanyInfoAddress> manuCompanyInfoAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuCompanyInfoAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuCompanyInfoAddress manuCompanyInfoAddress :
				manuCompanyInfoAddresses) {

			if (entityCache.getResult(
					ManuCompanyInfoAddressImpl.class,
					manuCompanyInfoAddress.getPrimaryKey()) == null) {

				cacheResult(manuCompanyInfoAddress);
			}
		}
	}

	/**
	 * Clears the cache for all manu company info addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuCompanyInfoAddressImpl.class);

		finderCache.clearCache(ManuCompanyInfoAddressImpl.class);
	}

	/**
	 * Clears the cache for the manu company info address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuCompanyInfoAddress manuCompanyInfoAddress) {
		entityCache.removeResult(
			ManuCompanyInfoAddressImpl.class, manuCompanyInfoAddress);
	}

	@Override
	public void clearCache(
		List<ManuCompanyInfoAddress> manuCompanyInfoAddresses) {

		for (ManuCompanyInfoAddress manuCompanyInfoAddress :
				manuCompanyInfoAddresses) {

			entityCache.removeResult(
				ManuCompanyInfoAddressImpl.class, manuCompanyInfoAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuCompanyInfoAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManuCompanyInfoAddressImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new manu company info address with the primary key. Does not add the manu company info address to the database.
	 *
	 * @param manuCompanyInfoAddressId the primary key for the new manu company info address
	 * @return the new manu company info address
	 */
	@Override
	public ManuCompanyInfoAddress create(long manuCompanyInfoAddressId) {
		ManuCompanyInfoAddress manuCompanyInfoAddress =
			new ManuCompanyInfoAddressImpl();

		manuCompanyInfoAddress.setNew(true);
		manuCompanyInfoAddress.setPrimaryKey(manuCompanyInfoAddressId);

		manuCompanyInfoAddress.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuCompanyInfoAddress;
	}

	/**
	 * Removes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress remove(long manuCompanyInfoAddressId)
		throws NoSuchManuCompanyInfoAddressException {

		return remove((Serializable)manuCompanyInfoAddressId);
	}

	/**
	 * Removes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress remove(Serializable primaryKey)
		throws NoSuchManuCompanyInfoAddressException {

		Session session = null;

		try {
			session = openSession();

			ManuCompanyInfoAddress manuCompanyInfoAddress =
				(ManuCompanyInfoAddress)session.get(
					ManuCompanyInfoAddressImpl.class, primaryKey);

			if (manuCompanyInfoAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuCompanyInfoAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuCompanyInfoAddress);
		}
		catch (NoSuchManuCompanyInfoAddressException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ManuCompanyInfoAddress removeImpl(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuCompanyInfoAddress)) {
				manuCompanyInfoAddress = (ManuCompanyInfoAddress)session.get(
					ManuCompanyInfoAddressImpl.class,
					manuCompanyInfoAddress.getPrimaryKeyObj());
			}

			if (manuCompanyInfoAddress != null) {
				session.delete(manuCompanyInfoAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuCompanyInfoAddress != null) {
			clearCache(manuCompanyInfoAddress);
		}

		return manuCompanyInfoAddress;
	}

	@Override
	public ManuCompanyInfoAddress updateImpl(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		boolean isNew = manuCompanyInfoAddress.isNew();

		if (!(manuCompanyInfoAddress instanceof
				ManuCompanyInfoAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuCompanyInfoAddress.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuCompanyInfoAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuCompanyInfoAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuCompanyInfoAddress implementation " +
					manuCompanyInfoAddress.getClass());
		}

		ManuCompanyInfoAddressModelImpl manuCompanyInfoAddressModelImpl =
			(ManuCompanyInfoAddressModelImpl)manuCompanyInfoAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuCompanyInfoAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuCompanyInfoAddress.setCreateDate(date);
			}
			else {
				manuCompanyInfoAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuCompanyInfoAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuCompanyInfoAddress.setModifiedDate(date);
			}
			else {
				manuCompanyInfoAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuCompanyInfoAddress);
			}
			else {
				manuCompanyInfoAddress = (ManuCompanyInfoAddress)session.merge(
					manuCompanyInfoAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuCompanyInfoAddressImpl.class, manuCompanyInfoAddressModelImpl,
			false, true);

		if (isNew) {
			manuCompanyInfoAddress.setNew(false);
		}

		manuCompanyInfoAddress.resetOriginalValues();

		return manuCompanyInfoAddress;
	}

	/**
	 * Returns the manu company info address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuCompanyInfoAddressException {

		ManuCompanyInfoAddress manuCompanyInfoAddress = fetchByPrimaryKey(
			primaryKey);

		if (manuCompanyInfoAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuCompanyInfoAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuCompanyInfoAddress;
	}

	/**
	 * Returns the manu company info address with the primary key or throws a <code>NoSuchManuCompanyInfoAddressException</code> if it could not be found.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress findByPrimaryKey(
			long manuCompanyInfoAddressId)
		throws NoSuchManuCompanyInfoAddressException {

		return findByPrimaryKey((Serializable)manuCompanyInfoAddressId);
	}

	/**
	 * Returns the manu company info address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address, or <code>null</code> if a manu company info address with the primary key could not be found
	 */
	@Override
	public ManuCompanyInfoAddress fetchByPrimaryKey(
		long manuCompanyInfoAddressId) {

		return fetchByPrimaryKey((Serializable)manuCompanyInfoAddressId);
	}

	/**
	 * Returns all the manu company info addresses.
	 *
	 * @return the manu company info addresses
	 */
	@Override
	public List<ManuCompanyInfoAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ManuCompanyInfoAddress> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ManuCompanyInfoAddress> list = null;

		if (useFinderCache) {
			list = (List<ManuCompanyInfoAddress>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUCOMPANYINFOADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUCOMPANYINFOADDRESS;

				sql = sql.concat(ManuCompanyInfoAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuCompanyInfoAddress>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the manu company info addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuCompanyInfoAddress manuCompanyInfoAddress : findAll()) {
			remove(manuCompanyInfoAddress);
		}
	}

	/**
	 * Returns the number of manu company info addresses.
	 *
	 * @return the number of manu company info addresses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_MANUCOMPANYINFOADDRESS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "manuCompanyInfoAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUCOMPANYINFOADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuCompanyInfoAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu company info address persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetMA_CIA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_CIA",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_CIA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_CIA",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_CIA = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_CIA",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_CII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_CII",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manuCompanyInfoId"}, true);

		_finderPathWithoutPaginationFindBygetMA_CII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_CII",
			new String[] {Long.class.getName()},
			new String[] {"manuCompanyInfoId"}, true);

		_finderPathCountBygetMA_CII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_CII",
			new String[] {Long.class.getName()},
			new String[] {"manuCompanyInfoId"}, false);

		ManuCompanyInfoAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuCompanyInfoAddressUtil.setPersistence(null);

		entityCache.removeCache(ManuCompanyInfoAddressImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUCOMPANYINFOADDRESS =
		"SELECT manuCompanyInfoAddress FROM ManuCompanyInfoAddress manuCompanyInfoAddress";

	private static final String _SQL_SELECT_MANUCOMPANYINFOADDRESS_WHERE =
		"SELECT manuCompanyInfoAddress FROM ManuCompanyInfoAddress manuCompanyInfoAddress WHERE ";

	private static final String _SQL_COUNT_MANUCOMPANYINFOADDRESS =
		"SELECT COUNT(manuCompanyInfoAddress) FROM ManuCompanyInfoAddress manuCompanyInfoAddress";

	private static final String _SQL_COUNT_MANUCOMPANYINFOADDRESS_WHERE =
		"SELECT COUNT(manuCompanyInfoAddress) FROM ManuCompanyInfoAddress manuCompanyInfoAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manuCompanyInfoAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuCompanyInfoAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuCompanyInfoAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuCompanyInfoAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}