/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevEmployeeSafetyInfoAddException;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;
import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeSafetyInfoAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmployeeSafetyInfoAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmployeeSafetyInfoAddUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev employee safety info add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevEmployeeSafetyInfoAddPersistence.class)
public class SezDevEmployeeSafetyInfoAddPersistenceImpl
	extends BasePersistenceImpl<SezDevEmployeeSafetyInfoAdd>
	implements SezDevEmployeeSafetyInfoAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevEmployeeSafetyInfoAddUtil</code> to access the sez dev employee safety info add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevEmployeeSafetyInfoAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of matching sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezDevEmployeeSafetyInfoAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevEmployeeSafetyInfoAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd :
						list) {

					if (sezStatusApplicationId !=
							sezDevEmployeeSafetyInfoAdd.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevEmployeeSafetyInfoAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevEmployeeSafetyInfoAdd>)QueryUtil.list(
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
	 * Returns the first sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a matching sez dev employee safety info add could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevEmployeeSafetyInfoAdd != null) {
			return sezDevEmployeeSafetyInfoAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevEmployeeSafetyInfoAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev employee safety info add, or <code>null</code> if a matching sez dev employee safety info add could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		List<SezDevEmployeeSafetyInfoAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a matching sez dev employee safety info add could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevEmployeeSafetyInfoAdd != null) {
			return sezDevEmployeeSafetyInfoAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevEmployeeSafetyInfoAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev employee safety info add, or <code>null</code> if a matching sez dev employee safety info add could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevEmployeeSafetyInfoAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev employee safety info adds before and after the current sez dev employee safety info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the current sez dev employee safety info add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevEmployeeSafetyInfoAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd =
			findByPrimaryKey(sezDevEmployeeSafetyInfoAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevEmployeeSafetyInfoAdd[] array =
				new SezDevEmployeeSafetyInfoAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevEmployeeSafetyInfoAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevEmployeeSafetyInfoAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevEmployeeSafetyInfoAdd, sezStatusApplicationId,
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

	protected SezDevEmployeeSafetyInfoAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezDevEmployeeSafetyInfoAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezDevEmployeeSafetyInfoAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevEmployeeSafetyInfoAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev employee safety info adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevEmployeeSafetyInfoAdd);
		}
	}

	/**
	 * Returns the number of sez dev employee safety info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev employee safety info adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVEMPLOYEESAFETYINFOADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevEmployeeSafetyInfoAdd.sezStatusApplicationId = ?";

	public SezDevEmployeeSafetyInfoAddPersistenceImpl() {
		setModelClass(SezDevEmployeeSafetyInfoAdd.class);

		setModelImplClass(SezDevEmployeeSafetyInfoAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevEmployeeSafetyInfoAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev employee safety info add in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeSafetyInfoAdd the sez dev employee safety info add
	 */
	@Override
	public void cacheResult(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		entityCache.putResult(
			SezDevEmployeeSafetyInfoAddImpl.class,
			sezDevEmployeeSafetyInfoAdd.getPrimaryKey(),
			sezDevEmployeeSafetyInfoAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev employee safety info adds in the entity cache if it is enabled.
	 *
	 * @param sezDevEmployeeSafetyInfoAdds the sez dev employee safety info adds
	 */
	@Override
	public void cacheResult(
		List<SezDevEmployeeSafetyInfoAdd> sezDevEmployeeSafetyInfoAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevEmployeeSafetyInfoAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd :
				sezDevEmployeeSafetyInfoAdds) {

			if (entityCache.getResult(
					SezDevEmployeeSafetyInfoAddImpl.class,
					sezDevEmployeeSafetyInfoAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevEmployeeSafetyInfoAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev employee safety info adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevEmployeeSafetyInfoAddImpl.class);

		finderCache.clearCache(SezDevEmployeeSafetyInfoAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev employee safety info add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		entityCache.removeResult(
			SezDevEmployeeSafetyInfoAddImpl.class, sezDevEmployeeSafetyInfoAdd);
	}

	@Override
	public void clearCache(
		List<SezDevEmployeeSafetyInfoAdd> sezDevEmployeeSafetyInfoAdds) {

		for (SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd :
				sezDevEmployeeSafetyInfoAdds) {

			entityCache.removeResult(
				SezDevEmployeeSafetyInfoAddImpl.class,
				sezDevEmployeeSafetyInfoAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevEmployeeSafetyInfoAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevEmployeeSafetyInfoAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev employee safety info add with the primary key. Does not add the sez dev employee safety info add to the database.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key for the new sez dev employee safety info add
	 * @return the new sez dev employee safety info add
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd create(
		long sezDevEmployeeSafetyInfoAddId) {

		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd =
			new SezDevEmployeeSafetyInfoAddImpl();

		sezDevEmployeeSafetyInfoAdd.setNew(true);
		sezDevEmployeeSafetyInfoAdd.setPrimaryKey(
			sezDevEmployeeSafetyInfoAddId);

		sezDevEmployeeSafetyInfoAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevEmployeeSafetyInfoAdd;
	}

	/**
	 * Removes the sez dev employee safety info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd remove(
			long sezDevEmployeeSafetyInfoAddId)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		return remove((Serializable)sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Removes the sez dev employee safety info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add that was removed
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd remove(Serializable primaryKey)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd =
				(SezDevEmployeeSafetyInfoAdd)session.get(
					SezDevEmployeeSafetyInfoAddImpl.class, primaryKey);

			if (sezDevEmployeeSafetyInfoAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevEmployeeSafetyInfoAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevEmployeeSafetyInfoAdd);
		}
		catch (NoSuchSezDevEmployeeSafetyInfoAddException
					noSuchEntityException) {

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
	protected SezDevEmployeeSafetyInfoAdd removeImpl(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevEmployeeSafetyInfoAdd)) {
				sezDevEmployeeSafetyInfoAdd =
					(SezDevEmployeeSafetyInfoAdd)session.get(
						SezDevEmployeeSafetyInfoAddImpl.class,
						sezDevEmployeeSafetyInfoAdd.getPrimaryKeyObj());
			}

			if (sezDevEmployeeSafetyInfoAdd != null) {
				session.delete(sezDevEmployeeSafetyInfoAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevEmployeeSafetyInfoAdd != null) {
			clearCache(sezDevEmployeeSafetyInfoAdd);
		}

		return sezDevEmployeeSafetyInfoAdd;
	}

	@Override
	public SezDevEmployeeSafetyInfoAdd updateImpl(
		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd) {

		boolean isNew = sezDevEmployeeSafetyInfoAdd.isNew();

		if (!(sezDevEmployeeSafetyInfoAdd instanceof
				SezDevEmployeeSafetyInfoAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezDevEmployeeSafetyInfoAdd.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevEmployeeSafetyInfoAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevEmployeeSafetyInfoAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevEmployeeSafetyInfoAdd implementation " +
					sezDevEmployeeSafetyInfoAdd.getClass());
		}

		SezDevEmployeeSafetyInfoAddModelImpl
			sezDevEmployeeSafetyInfoAddModelImpl =
				(SezDevEmployeeSafetyInfoAddModelImpl)
					sezDevEmployeeSafetyInfoAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevEmployeeSafetyInfoAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevEmployeeSafetyInfoAdd.setCreateDate(date);
			}
			else {
				sezDevEmployeeSafetyInfoAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevEmployeeSafetyInfoAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevEmployeeSafetyInfoAdd.setModifiedDate(date);
			}
			else {
				sezDevEmployeeSafetyInfoAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevEmployeeSafetyInfoAdd);
			}
			else {
				sezDevEmployeeSafetyInfoAdd =
					(SezDevEmployeeSafetyInfoAdd)session.merge(
						sezDevEmployeeSafetyInfoAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevEmployeeSafetyInfoAddImpl.class,
			sezDevEmployeeSafetyInfoAddModelImpl, false, true);

		if (isNew) {
			sezDevEmployeeSafetyInfoAdd.setNew(false);
		}

		sezDevEmployeeSafetyInfoAdd.resetOriginalValues();

		return sezDevEmployeeSafetyInfoAdd;
	}

	/**
	 * Returns the sez dev employee safety info add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd =
			fetchByPrimaryKey(primaryKey);

		if (sezDevEmployeeSafetyInfoAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevEmployeeSafetyInfoAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevEmployeeSafetyInfoAdd;
	}

	/**
	 * Returns the sez dev employee safety info add with the primary key or throws a <code>NoSuchSezDevEmployeeSafetyInfoAddException</code> if it could not be found.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add
	 * @throws NoSuchSezDevEmployeeSafetyInfoAddException if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd findByPrimaryKey(
			long sezDevEmployeeSafetyInfoAddId)
		throws NoSuchSezDevEmployeeSafetyInfoAddException {

		return findByPrimaryKey((Serializable)sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Returns the sez dev employee safety info add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmployeeSafetyInfoAddId the primary key of the sez dev employee safety info add
	 * @return the sez dev employee safety info add, or <code>null</code> if a sez dev employee safety info add with the primary key could not be found
	 */
	@Override
	public SezDevEmployeeSafetyInfoAdd fetchByPrimaryKey(
		long sezDevEmployeeSafetyInfoAddId) {

		return fetchByPrimaryKey((Serializable)sezDevEmployeeSafetyInfoAddId);
	}

	/**
	 * Returns all the sez dev employee safety info adds.
	 *
	 * @return the sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @return the range of sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev employee safety info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmployeeSafetyInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee safety info adds
	 * @param end the upper bound of the range of sez dev employee safety info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev employee safety info adds
	 */
	@Override
	public List<SezDevEmployeeSafetyInfoAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevEmployeeSafetyInfoAdd> orderByComparator,
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

		List<SezDevEmployeeSafetyInfoAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevEmployeeSafetyInfoAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD;

				sql = sql.concat(
					SezDevEmployeeSafetyInfoAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevEmployeeSafetyInfoAdd>)QueryUtil.list(
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
	 * Removes all the sez dev employee safety info adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd :
				findAll()) {

			remove(sezDevEmployeeSafetyInfoAdd);
		}
	}

	/**
	 * Returns the number of sez dev employee safety info adds.
	 *
	 * @return the number of sez dev employee safety info adds
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
					_SQL_COUNT_SEZDEVEMPLOYEESAFETYINFOADD);

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
		return "sezDevEmployeeSafetyInfoAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevEmployeeSafetyInfoAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev employee safety info add persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevEmployeeSafetyInfoAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevEmployeeSafetyInfoAddUtil.setPersistence(null);

		entityCache.removeCache(
			SezDevEmployeeSafetyInfoAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD =
		"SELECT sezDevEmployeeSafetyInfoAdd FROM SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd";

	private static final String _SQL_SELECT_SEZDEVEMPLOYEESAFETYINFOADD_WHERE =
		"SELECT sezDevEmployeeSafetyInfoAdd FROM SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVEMPLOYEESAFETYINFOADD =
		"SELECT COUNT(sezDevEmployeeSafetyInfoAdd) FROM SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd";

	private static final String _SQL_COUNT_SEZDEVEMPLOYEESAFETYINFOADD_WHERE =
		"SELECT COUNT(sezDevEmployeeSafetyInfoAdd) FROM SezDevEmployeeSafetyInfoAdd sezDevEmployeeSafetyInfoAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevEmployeeSafetyInfoAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevEmployeeSafetyInfoAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevEmployeeSafetyInfoAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevEmployeeSafetyInfoAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}