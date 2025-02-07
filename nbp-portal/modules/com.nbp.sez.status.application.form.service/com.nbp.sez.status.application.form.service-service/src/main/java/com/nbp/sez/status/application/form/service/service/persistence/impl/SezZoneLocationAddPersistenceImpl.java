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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneLocationAddException;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneLocationAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneLocationAddUtil;
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
 * The persistence implementation for the sez zone location add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneLocationAddPersistence.class)
public class SezZoneLocationAddPersistenceImpl
	extends BasePersistenceImpl<SezZoneLocationAdd>
	implements SezZoneLocationAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneLocationAddUtil</code> to access the sez zone location add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneLocationAddImpl.class.getName();

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
	 * Returns all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of matching sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator,
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

		List<SezZoneLocationAdd> list = null;

		if (useFinderCache) {
			list = (List<SezZoneLocationAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezZoneLocationAdd sezZoneLocationAdd : list) {
					if (sezStatusApplicationId !=
							sezZoneLocationAdd.getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZZONELOCATIONADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezZoneLocationAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezZoneLocationAdd>)QueryUtil.list(
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
	 * Returns the first sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a matching sez zone location add could not be found
	 */
	@Override
	public SezZoneLocationAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneLocationAdd> orderByComparator)
		throws NoSuchSezZoneLocationAddException {

		SezZoneLocationAdd sezZoneLocationAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezZoneLocationAdd != null) {
			return sezZoneLocationAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezZoneLocationAddException(sb.toString());
	}

	/**
	 * Returns the first sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone location add, or <code>null</code> if a matching sez zone location add could not be found
	 */
	@Override
	public SezZoneLocationAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		List<SezZoneLocationAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a matching sez zone location add could not be found
	 */
	@Override
	public SezZoneLocationAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneLocationAdd> orderByComparator)
		throws NoSuchSezZoneLocationAddException {

		SezZoneLocationAdd sezZoneLocationAdd = fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);

		if (sezZoneLocationAdd != null) {
			return sezZoneLocationAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezZoneLocationAddException(sb.toString());
	}

	/**
	 * Returns the last sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone location add, or <code>null</code> if a matching sez zone location add could not be found
	 */
	@Override
	public SezZoneLocationAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezZoneLocationAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez zone location adds before and after the current sez zone location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneLocationAddId the primary key of the current sez zone location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public SezZoneLocationAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneLocationAddId, long sezStatusApplicationId,
			OrderByComparator<SezZoneLocationAdd> orderByComparator)
		throws NoSuchSezZoneLocationAddException {

		SezZoneLocationAdd sezZoneLocationAdd = findByPrimaryKey(
			sezZoneLocationAddId);

		Session session = null;

		try {
			session = openSession();

			SezZoneLocationAdd[] array = new SezZoneLocationAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezZoneLocationAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezZoneLocationAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezZoneLocationAdd, sezStatusApplicationId,
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

	protected SezZoneLocationAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezZoneLocationAdd sezZoneLocationAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezZoneLocationAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZZONELOCATIONADD_WHERE);

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
			sb.append(SezZoneLocationAddModelImpl.ORDER_BY_JPQL);
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
						sezZoneLocationAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezZoneLocationAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez zone location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezZoneLocationAdd sezZoneLocationAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezZoneLocationAdd);
		}
	}

	/**
	 * Returns the number of sez zone location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone location adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONELOCATIONADD_WHERE);

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
			"sezZoneLocationAdd.sezStatusApplicationId = ?";

	public SezZoneLocationAddPersistenceImpl() {
		setModelClass(SezZoneLocationAdd.class);

		setModelImplClass(SezZoneLocationAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneLocationAddTable.INSTANCE);
	}

	/**
	 * Caches the sez zone location add in the entity cache if it is enabled.
	 *
	 * @param sezZoneLocationAdd the sez zone location add
	 */
	@Override
	public void cacheResult(SezZoneLocationAdd sezZoneLocationAdd) {
		entityCache.putResult(
			SezZoneLocationAddImpl.class, sezZoneLocationAdd.getPrimaryKey(),
			sezZoneLocationAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone location adds in the entity cache if it is enabled.
	 *
	 * @param sezZoneLocationAdds the sez zone location adds
	 */
	@Override
	public void cacheResult(List<SezZoneLocationAdd> sezZoneLocationAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneLocationAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneLocationAdd sezZoneLocationAdd : sezZoneLocationAdds) {
			if (entityCache.getResult(
					SezZoneLocationAddImpl.class,
					sezZoneLocationAdd.getPrimaryKey()) == null) {

				cacheResult(sezZoneLocationAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone location adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneLocationAddImpl.class);

		finderCache.clearCache(SezZoneLocationAddImpl.class);
	}

	/**
	 * Clears the cache for the sez zone location add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneLocationAdd sezZoneLocationAdd) {
		entityCache.removeResult(
			SezZoneLocationAddImpl.class, sezZoneLocationAdd);
	}

	@Override
	public void clearCache(List<SezZoneLocationAdd> sezZoneLocationAdds) {
		for (SezZoneLocationAdd sezZoneLocationAdd : sezZoneLocationAdds) {
			entityCache.removeResult(
				SezZoneLocationAddImpl.class, sezZoneLocationAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneLocationAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezZoneLocationAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez zone location add with the primary key. Does not add the sez zone location add to the database.
	 *
	 * @param sezZoneLocationAddId the primary key for the new sez zone location add
	 * @return the new sez zone location add
	 */
	@Override
	public SezZoneLocationAdd create(long sezZoneLocationAddId) {
		SezZoneLocationAdd sezZoneLocationAdd = new SezZoneLocationAddImpl();

		sezZoneLocationAdd.setNew(true);
		sezZoneLocationAdd.setPrimaryKey(sezZoneLocationAddId);

		sezZoneLocationAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneLocationAdd;
	}

	/**
	 * Removes the sez zone location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add that was removed
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public SezZoneLocationAdd remove(long sezZoneLocationAddId)
		throws NoSuchSezZoneLocationAddException {

		return remove((Serializable)sezZoneLocationAddId);
	}

	/**
	 * Removes the sez zone location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone location add
	 * @return the sez zone location add that was removed
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public SezZoneLocationAdd remove(Serializable primaryKey)
		throws NoSuchSezZoneLocationAddException {

		Session session = null;

		try {
			session = openSession();

			SezZoneLocationAdd sezZoneLocationAdd =
				(SezZoneLocationAdd)session.get(
					SezZoneLocationAddImpl.class, primaryKey);

			if (sezZoneLocationAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneLocationAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneLocationAdd);
		}
		catch (NoSuchSezZoneLocationAddException noSuchEntityException) {
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
	protected SezZoneLocationAdd removeImpl(
		SezZoneLocationAdd sezZoneLocationAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneLocationAdd)) {
				sezZoneLocationAdd = (SezZoneLocationAdd)session.get(
					SezZoneLocationAddImpl.class,
					sezZoneLocationAdd.getPrimaryKeyObj());
			}

			if (sezZoneLocationAdd != null) {
				session.delete(sezZoneLocationAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneLocationAdd != null) {
			clearCache(sezZoneLocationAdd);
		}

		return sezZoneLocationAdd;
	}

	@Override
	public SezZoneLocationAdd updateImpl(
		SezZoneLocationAdd sezZoneLocationAdd) {

		boolean isNew = sezZoneLocationAdd.isNew();

		if (!(sezZoneLocationAdd instanceof SezZoneLocationAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneLocationAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneLocationAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneLocationAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneLocationAdd implementation " +
					sezZoneLocationAdd.getClass());
		}

		SezZoneLocationAddModelImpl sezZoneLocationAddModelImpl =
			(SezZoneLocationAddModelImpl)sezZoneLocationAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneLocationAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneLocationAdd.setCreateDate(date);
			}
			else {
				sezZoneLocationAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneLocationAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneLocationAdd.setModifiedDate(date);
			}
			else {
				sezZoneLocationAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneLocationAdd);
			}
			else {
				sezZoneLocationAdd = (SezZoneLocationAdd)session.merge(
					sezZoneLocationAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneLocationAddImpl.class, sezZoneLocationAddModelImpl, false,
			true);

		if (isNew) {
			sezZoneLocationAdd.setNew(false);
		}

		sezZoneLocationAdd.resetOriginalValues();

		return sezZoneLocationAdd;
	}

	/**
	 * Returns the sez zone location add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone location add
	 * @return the sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public SezZoneLocationAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneLocationAddException {

		SezZoneLocationAdd sezZoneLocationAdd = fetchByPrimaryKey(primaryKey);

		if (sezZoneLocationAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneLocationAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneLocationAdd;
	}

	/**
	 * Returns the sez zone location add with the primary key or throws a <code>NoSuchSezZoneLocationAddException</code> if it could not be found.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add
	 * @throws NoSuchSezZoneLocationAddException if a sez zone location add with the primary key could not be found
	 */
	@Override
	public SezZoneLocationAdd findByPrimaryKey(long sezZoneLocationAddId)
		throws NoSuchSezZoneLocationAddException {

		return findByPrimaryKey((Serializable)sezZoneLocationAddId);
	}

	/**
	 * Returns the sez zone location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneLocationAddId the primary key of the sez zone location add
	 * @return the sez zone location add, or <code>null</code> if a sez zone location add with the primary key could not be found
	 */
	@Override
	public SezZoneLocationAdd fetchByPrimaryKey(long sezZoneLocationAddId) {
		return fetchByPrimaryKey((Serializable)sezZoneLocationAddId);
	}

	/**
	 * Returns all the sez zone location adds.
	 *
	 * @return the sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @return the range of sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone location adds
	 * @param end the upper bound of the range of sez zone location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone location adds
	 */
	@Override
	public List<SezZoneLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezZoneLocationAdd> orderByComparator,
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

		List<SezZoneLocationAdd> list = null;

		if (useFinderCache) {
			list = (List<SezZoneLocationAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONELOCATIONADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONELOCATIONADD;

				sql = sql.concat(SezZoneLocationAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneLocationAdd>)QueryUtil.list(
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
	 * Removes all the sez zone location adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneLocationAdd sezZoneLocationAdd : findAll()) {
			remove(sezZoneLocationAdd);
		}
	}

	/**
	 * Returns the number of sez zone location adds.
	 *
	 * @return the number of sez zone location adds
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
					_SQL_COUNT_SEZZONELOCATIONADD);

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
		return "sezZoneLocationAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONELOCATIONADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneLocationAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone location add persistence.
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

		SezZoneLocationAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneLocationAddUtil.setPersistence(null);

		entityCache.removeCache(SezZoneLocationAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONELOCATIONADD =
		"SELECT sezZoneLocationAdd FROM SezZoneLocationAdd sezZoneLocationAdd";

	private static final String _SQL_SELECT_SEZZONELOCATIONADD_WHERE =
		"SELECT sezZoneLocationAdd FROM SezZoneLocationAdd sezZoneLocationAdd WHERE ";

	private static final String _SQL_COUNT_SEZZONELOCATIONADD =
		"SELECT COUNT(sezZoneLocationAdd) FROM SezZoneLocationAdd sezZoneLocationAdd";

	private static final String _SQL_COUNT_SEZZONELOCATIONADD_WHERE =
		"SELECT COUNT(sezZoneLocationAdd) FROM SezZoneLocationAdd sezZoneLocationAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezZoneLocationAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneLocationAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneLocationAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneLocationAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}