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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevGenBusinessInfoAddException;
import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd;
import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevGenBusinessInfoAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevGenBusinessInfoAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevGenBusinessInfoAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevGenBusinessInfoAddUtil;
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
 * The persistence implementation for the sez dev gen business info add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevGenBusinessInfoAddPersistence.class)
public class SezDevGenBusinessInfoAddPersistenceImpl
	extends BasePersistenceImpl<SezDevGenBusinessInfoAdd>
	implements SezDevGenBusinessInfoAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevGenBusinessInfoAddUtil</code> to access the sez dev gen business info add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevGenBusinessInfoAddImpl.class.getName();

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
	 * Returns all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @return the range of matching sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator,
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

		List<SezDevGenBusinessInfoAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevGenBusinessInfoAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd : list) {
					if (sezStatusApplicationId !=
							sezDevGenBusinessInfoAdd.
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

			sb.append(_SQL_SELECT_SEZDEVGENBUSINESSINFOADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevGenBusinessInfoAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevGenBusinessInfoAdd>)QueryUtil.list(
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
	 * Returns the first sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a matching sez dev gen business info add could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator)
		throws NoSuchSezDevGenBusinessInfoAddException {

		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevGenBusinessInfoAdd != null) {
			return sezDevGenBusinessInfoAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevGenBusinessInfoAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev gen business info add, or <code>null</code> if a matching sez dev gen business info add could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator) {

		List<SezDevGenBusinessInfoAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a matching sez dev gen business info add could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator)
		throws NoSuchSezDevGenBusinessInfoAddException {

		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevGenBusinessInfoAdd != null) {
			return sezDevGenBusinessInfoAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevGenBusinessInfoAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev gen business info add, or <code>null</code> if a matching sez dev gen business info add could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevGenBusinessInfoAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev gen business info adds before and after the current sez dev gen business info add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the current sez dev gen business info add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevGenBusinessInfoAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator)
		throws NoSuchSezDevGenBusinessInfoAddException {

		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd = findByPrimaryKey(
			sezDevGenBusinessInfoAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevGenBusinessInfoAdd[] array =
				new SezDevGenBusinessInfoAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevGenBusinessInfoAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevGenBusinessInfoAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevGenBusinessInfoAdd, sezStatusApplicationId,
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

	protected SezDevGenBusinessInfoAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVGENBUSINESSINFOADD_WHERE);

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
			sb.append(SezDevGenBusinessInfoAddModelImpl.ORDER_BY_JPQL);
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
						sezDevGenBusinessInfoAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevGenBusinessInfoAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev gen business info adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevGenBusinessInfoAdd);
		}
	}

	/**
	 * Returns the number of sez dev gen business info adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev gen business info adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVGENBUSINESSINFOADD_WHERE);

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
			"sezDevGenBusinessInfoAdd.sezStatusApplicationId = ?";

	public SezDevGenBusinessInfoAddPersistenceImpl() {
		setModelClass(SezDevGenBusinessInfoAdd.class);

		setModelImplClass(SezDevGenBusinessInfoAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevGenBusinessInfoAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev gen business info add in the entity cache if it is enabled.
	 *
	 * @param sezDevGenBusinessInfoAdd the sez dev gen business info add
	 */
	@Override
	public void cacheResult(SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {
		entityCache.putResult(
			SezDevGenBusinessInfoAddImpl.class,
			sezDevGenBusinessInfoAdd.getPrimaryKey(), sezDevGenBusinessInfoAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev gen business info adds in the entity cache if it is enabled.
	 *
	 * @param sezDevGenBusinessInfoAdds the sez dev gen business info adds
	 */
	@Override
	public void cacheResult(
		List<SezDevGenBusinessInfoAdd> sezDevGenBusinessInfoAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevGenBusinessInfoAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd :
				sezDevGenBusinessInfoAdds) {

			if (entityCache.getResult(
					SezDevGenBusinessInfoAddImpl.class,
					sezDevGenBusinessInfoAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevGenBusinessInfoAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev gen business info adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevGenBusinessInfoAddImpl.class);

		finderCache.clearCache(SezDevGenBusinessInfoAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev gen business info add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {
		entityCache.removeResult(
			SezDevGenBusinessInfoAddImpl.class, sezDevGenBusinessInfoAdd);
	}

	@Override
	public void clearCache(
		List<SezDevGenBusinessInfoAdd> sezDevGenBusinessInfoAdds) {

		for (SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd :
				sezDevGenBusinessInfoAdds) {

			entityCache.removeResult(
				SezDevGenBusinessInfoAddImpl.class, sezDevGenBusinessInfoAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevGenBusinessInfoAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevGenBusinessInfoAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev gen business info add with the primary key. Does not add the sez dev gen business info add to the database.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key for the new sez dev gen business info add
	 * @return the new sez dev gen business info add
	 */
	@Override
	public SezDevGenBusinessInfoAdd create(long sezDevGenBusinessInfoAddId) {
		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd =
			new SezDevGenBusinessInfoAddImpl();

		sezDevGenBusinessInfoAdd.setNew(true);
		sezDevGenBusinessInfoAdd.setPrimaryKey(sezDevGenBusinessInfoAddId);

		sezDevGenBusinessInfoAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevGenBusinessInfoAdd;
	}

	/**
	 * Removes the sez dev gen business info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add that was removed
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd remove(long sezDevGenBusinessInfoAddId)
		throws NoSuchSezDevGenBusinessInfoAddException {

		return remove((Serializable)sezDevGenBusinessInfoAddId);
	}

	/**
	 * Removes the sez dev gen business info add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add that was removed
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd remove(Serializable primaryKey)
		throws NoSuchSezDevGenBusinessInfoAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd =
				(SezDevGenBusinessInfoAdd)session.get(
					SezDevGenBusinessInfoAddImpl.class, primaryKey);

			if (sezDevGenBusinessInfoAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevGenBusinessInfoAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevGenBusinessInfoAdd);
		}
		catch (NoSuchSezDevGenBusinessInfoAddException noSuchEntityException) {
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
	protected SezDevGenBusinessInfoAdd removeImpl(
		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevGenBusinessInfoAdd)) {
				sezDevGenBusinessInfoAdd =
					(SezDevGenBusinessInfoAdd)session.get(
						SezDevGenBusinessInfoAddImpl.class,
						sezDevGenBusinessInfoAdd.getPrimaryKeyObj());
			}

			if (sezDevGenBusinessInfoAdd != null) {
				session.delete(sezDevGenBusinessInfoAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevGenBusinessInfoAdd != null) {
			clearCache(sezDevGenBusinessInfoAdd);
		}

		return sezDevGenBusinessInfoAdd;
	}

	@Override
	public SezDevGenBusinessInfoAdd updateImpl(
		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {

		boolean isNew = sezDevGenBusinessInfoAdd.isNew();

		if (!(sezDevGenBusinessInfoAdd instanceof
				SezDevGenBusinessInfoAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevGenBusinessInfoAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevGenBusinessInfoAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevGenBusinessInfoAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevGenBusinessInfoAdd implementation " +
					sezDevGenBusinessInfoAdd.getClass());
		}

		SezDevGenBusinessInfoAddModelImpl sezDevGenBusinessInfoAddModelImpl =
			(SezDevGenBusinessInfoAddModelImpl)sezDevGenBusinessInfoAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevGenBusinessInfoAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevGenBusinessInfoAdd.setCreateDate(date);
			}
			else {
				sezDevGenBusinessInfoAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevGenBusinessInfoAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevGenBusinessInfoAdd.setModifiedDate(date);
			}
			else {
				sezDevGenBusinessInfoAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevGenBusinessInfoAdd);
			}
			else {
				sezDevGenBusinessInfoAdd =
					(SezDevGenBusinessInfoAdd)session.merge(
						sezDevGenBusinessInfoAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevGenBusinessInfoAddImpl.class,
			sezDevGenBusinessInfoAddModelImpl, false, true);

		if (isNew) {
			sezDevGenBusinessInfoAdd.setNew(false);
		}

		sezDevGenBusinessInfoAdd.resetOriginalValues();

		return sezDevGenBusinessInfoAdd;
	}

	/**
	 * Returns the sez dev gen business info add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevGenBusinessInfoAddException {

		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd = fetchByPrimaryKey(
			primaryKey);

		if (sezDevGenBusinessInfoAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevGenBusinessInfoAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevGenBusinessInfoAdd;
	}

	/**
	 * Returns the sez dev gen business info add with the primary key or throws a <code>NoSuchSezDevGenBusinessInfoAddException</code> if it could not be found.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add
	 * @throws NoSuchSezDevGenBusinessInfoAddException if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd findByPrimaryKey(
			long sezDevGenBusinessInfoAddId)
		throws NoSuchSezDevGenBusinessInfoAddException {

		return findByPrimaryKey((Serializable)sezDevGenBusinessInfoAddId);
	}

	/**
	 * Returns the sez dev gen business info add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevGenBusinessInfoAddId the primary key of the sez dev gen business info add
	 * @return the sez dev gen business info add, or <code>null</code> if a sez dev gen business info add with the primary key could not be found
	 */
	@Override
	public SezDevGenBusinessInfoAdd fetchByPrimaryKey(
		long sezDevGenBusinessInfoAddId) {

		return fetchByPrimaryKey((Serializable)sezDevGenBusinessInfoAddId);
	}

	/**
	 * Returns all the sez dev gen business info adds.
	 *
	 * @return the sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @return the range of sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev gen business info adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGenBusinessInfoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev gen business info adds
	 * @param end the upper bound of the range of sez dev gen business info adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev gen business info adds
	 */
	@Override
	public List<SezDevGenBusinessInfoAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevGenBusinessInfoAdd> orderByComparator,
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

		List<SezDevGenBusinessInfoAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevGenBusinessInfoAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVGENBUSINESSINFOADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVGENBUSINESSINFOADD;

				sql = sql.concat(
					SezDevGenBusinessInfoAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevGenBusinessInfoAdd>)QueryUtil.list(
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
	 * Removes all the sez dev gen business info adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd : findAll()) {
			remove(sezDevGenBusinessInfoAdd);
		}
	}

	/**
	 * Returns the number of sez dev gen business info adds.
	 *
	 * @return the number of sez dev gen business info adds
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
					_SQL_COUNT_SEZDEVGENBUSINESSINFOADD);

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
		return "sezDevGenBusinessInfoAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVGENBUSINESSINFOADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevGenBusinessInfoAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev gen business info add persistence.
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

		SezDevGenBusinessInfoAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevGenBusinessInfoAddUtil.setPersistence(null);

		entityCache.removeCache(SezDevGenBusinessInfoAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVGENBUSINESSINFOADD =
		"SELECT sezDevGenBusinessInfoAdd FROM SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd";

	private static final String _SQL_SELECT_SEZDEVGENBUSINESSINFOADD_WHERE =
		"SELECT sezDevGenBusinessInfoAdd FROM SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVGENBUSINESSINFOADD =
		"SELECT COUNT(sezDevGenBusinessInfoAdd) FROM SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd";

	private static final String _SQL_COUNT_SEZDEVGENBUSINESSINFOADD_WHERE =
		"SELECT COUNT(sezDevGenBusinessInfoAdd) FROM SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevGenBusinessInfoAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevGenBusinessInfoAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevGenBusinessInfoAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevGenBusinessInfoAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}