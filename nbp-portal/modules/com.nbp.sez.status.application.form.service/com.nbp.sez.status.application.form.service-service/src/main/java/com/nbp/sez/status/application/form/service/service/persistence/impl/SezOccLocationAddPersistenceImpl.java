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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccLocationAddException;
import com.nbp.sez.status.application.form.service.model.SezOccLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezOccLocationAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccLocationAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccLocationAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccLocationAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccLocationAddUtil;
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
 * The persistence implementation for the sez occ location add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccLocationAddPersistence.class)
public class SezOccLocationAddPersistenceImpl
	extends BasePersistenceImpl<SezOccLocationAdd>
	implements SezOccLocationAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccLocationAddUtil</code> to access the sez occ location add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccLocationAddImpl.class.getName();

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
	 * Returns all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of matching sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator,
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

		List<SezOccLocationAdd> list = null;

		if (useFinderCache) {
			list = (List<SezOccLocationAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccLocationAdd sezOccLocationAdd : list) {
					if (sezStatusApplicationId !=
							sezOccLocationAdd.getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZOCCLOCATIONADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezOccLocationAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezOccLocationAdd>)QueryUtil.list(
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
	 * Returns the first sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a matching sez occ location add could not be found
	 */
	@Override
	public SezOccLocationAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccLocationAdd> orderByComparator)
		throws NoSuchSezOccLocationAddException {

		SezOccLocationAdd sezOccLocationAdd = fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);

		if (sezOccLocationAdd != null) {
			return sezOccLocationAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccLocationAddException(sb.toString());
	}

	/**
	 * Returns the first sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occ location add, or <code>null</code> if a matching sez occ location add could not be found
	 */
	@Override
	public SezOccLocationAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		List<SezOccLocationAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a matching sez occ location add could not be found
	 */
	@Override
	public SezOccLocationAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccLocationAdd> orderByComparator)
		throws NoSuchSezOccLocationAddException {

		SezOccLocationAdd sezOccLocationAdd = fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);

		if (sezOccLocationAdd != null) {
			return sezOccLocationAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccLocationAddException(sb.toString());
	}

	/**
	 * Returns the last sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occ location add, or <code>null</code> if a matching sez occ location add could not be found
	 */
	@Override
	public SezOccLocationAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccLocationAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occ location adds before and after the current sez occ location add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccLocationAddId the primary key of the current sez occ location add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public SezOccLocationAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccLocationAddId, long sezStatusApplicationId,
			OrderByComparator<SezOccLocationAdd> orderByComparator)
		throws NoSuchSezOccLocationAddException {

		SezOccLocationAdd sezOccLocationAdd = findByPrimaryKey(
			sezOccLocationAddId);

		Session session = null;

		try {
			session = openSession();

			SezOccLocationAdd[] array = new SezOccLocationAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccLocationAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezOccLocationAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccLocationAdd, sezStatusApplicationId,
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

	protected SezOccLocationAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezOccLocationAdd sezOccLocationAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezOccLocationAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZOCCLOCATIONADD_WHERE);

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
			sb.append(SezOccLocationAddModelImpl.ORDER_BY_JPQL);
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
						sezOccLocationAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccLocationAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occ location adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezOccLocationAdd sezOccLocationAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezOccLocationAdd);
		}
	}

	/**
	 * Returns the number of sez occ location adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occ location adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCLOCATIONADD_WHERE);

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
			"sezOccLocationAdd.sezStatusApplicationId = ?";

	public SezOccLocationAddPersistenceImpl() {
		setModelClass(SezOccLocationAdd.class);

		setModelImplClass(SezOccLocationAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccLocationAddTable.INSTANCE);
	}

	/**
	 * Caches the sez occ location add in the entity cache if it is enabled.
	 *
	 * @param sezOccLocationAdd the sez occ location add
	 */
	@Override
	public void cacheResult(SezOccLocationAdd sezOccLocationAdd) {
		entityCache.putResult(
			SezOccLocationAddImpl.class, sezOccLocationAdd.getPrimaryKey(),
			sezOccLocationAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occ location adds in the entity cache if it is enabled.
	 *
	 * @param sezOccLocationAdds the sez occ location adds
	 */
	@Override
	public void cacheResult(List<SezOccLocationAdd> sezOccLocationAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccLocationAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccLocationAdd sezOccLocationAdd : sezOccLocationAdds) {
			if (entityCache.getResult(
					SezOccLocationAddImpl.class,
					sezOccLocationAdd.getPrimaryKey()) == null) {

				cacheResult(sezOccLocationAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez occ location adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccLocationAddImpl.class);

		finderCache.clearCache(SezOccLocationAddImpl.class);
	}

	/**
	 * Clears the cache for the sez occ location add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezOccLocationAdd sezOccLocationAdd) {
		entityCache.removeResult(
			SezOccLocationAddImpl.class, sezOccLocationAdd);
	}

	@Override
	public void clearCache(List<SezOccLocationAdd> sezOccLocationAdds) {
		for (SezOccLocationAdd sezOccLocationAdd : sezOccLocationAdds) {
			entityCache.removeResult(
				SezOccLocationAddImpl.class, sezOccLocationAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccLocationAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezOccLocationAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez occ location add with the primary key. Does not add the sez occ location add to the database.
	 *
	 * @param sezOccLocationAddId the primary key for the new sez occ location add
	 * @return the new sez occ location add
	 */
	@Override
	public SezOccLocationAdd create(long sezOccLocationAddId) {
		SezOccLocationAdd sezOccLocationAdd = new SezOccLocationAddImpl();

		sezOccLocationAdd.setNew(true);
		sezOccLocationAdd.setPrimaryKey(sezOccLocationAddId);

		sezOccLocationAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezOccLocationAdd;
	}

	/**
	 * Removes the sez occ location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add that was removed
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public SezOccLocationAdd remove(long sezOccLocationAddId)
		throws NoSuchSezOccLocationAddException {

		return remove((Serializable)sezOccLocationAddId);
	}

	/**
	 * Removes the sez occ location add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occ location add
	 * @return the sez occ location add that was removed
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public SezOccLocationAdd remove(Serializable primaryKey)
		throws NoSuchSezOccLocationAddException {

		Session session = null;

		try {
			session = openSession();

			SezOccLocationAdd sezOccLocationAdd =
				(SezOccLocationAdd)session.get(
					SezOccLocationAddImpl.class, primaryKey);

			if (sezOccLocationAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccLocationAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccLocationAdd);
		}
		catch (NoSuchSezOccLocationAddException noSuchEntityException) {
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
	protected SezOccLocationAdd removeImpl(
		SezOccLocationAdd sezOccLocationAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccLocationAdd)) {
				sezOccLocationAdd = (SezOccLocationAdd)session.get(
					SezOccLocationAddImpl.class,
					sezOccLocationAdd.getPrimaryKeyObj());
			}

			if (sezOccLocationAdd != null) {
				session.delete(sezOccLocationAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccLocationAdd != null) {
			clearCache(sezOccLocationAdd);
		}

		return sezOccLocationAdd;
	}

	@Override
	public SezOccLocationAdd updateImpl(SezOccLocationAdd sezOccLocationAdd) {
		boolean isNew = sezOccLocationAdd.isNew();

		if (!(sezOccLocationAdd instanceof SezOccLocationAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezOccLocationAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccLocationAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccLocationAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccLocationAdd implementation " +
					sezOccLocationAdd.getClass());
		}

		SezOccLocationAddModelImpl sezOccLocationAddModelImpl =
			(SezOccLocationAddModelImpl)sezOccLocationAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccLocationAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccLocationAdd.setCreateDate(date);
			}
			else {
				sezOccLocationAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccLocationAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccLocationAdd.setModifiedDate(date);
			}
			else {
				sezOccLocationAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccLocationAdd);
			}
			else {
				sezOccLocationAdd = (SezOccLocationAdd)session.merge(
					sezOccLocationAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccLocationAddImpl.class, sezOccLocationAddModelImpl, false,
			true);

		if (isNew) {
			sezOccLocationAdd.setNew(false);
		}

		sezOccLocationAdd.resetOriginalValues();

		return sezOccLocationAdd;
	}

	/**
	 * Returns the sez occ location add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occ location add
	 * @return the sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public SezOccLocationAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezOccLocationAddException {

		SezOccLocationAdd sezOccLocationAdd = fetchByPrimaryKey(primaryKey);

		if (sezOccLocationAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccLocationAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccLocationAdd;
	}

	/**
	 * Returns the sez occ location add with the primary key or throws a <code>NoSuchSezOccLocationAddException</code> if it could not be found.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add
	 * @throws NoSuchSezOccLocationAddException if a sez occ location add with the primary key could not be found
	 */
	@Override
	public SezOccLocationAdd findByPrimaryKey(long sezOccLocationAddId)
		throws NoSuchSezOccLocationAddException {

		return findByPrimaryKey((Serializable)sezOccLocationAddId);
	}

	/**
	 * Returns the sez occ location add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccLocationAddId the primary key of the sez occ location add
	 * @return the sez occ location add, or <code>null</code> if a sez occ location add with the primary key could not be found
	 */
	@Override
	public SezOccLocationAdd fetchByPrimaryKey(long sezOccLocationAddId) {
		return fetchByPrimaryKey((Serializable)sezOccLocationAddId);
	}

	/**
	 * Returns all the sez occ location adds.
	 *
	 * @return the sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @return the range of sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occ location adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccLocationAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occ location adds
	 * @param end the upper bound of the range of sez occ location adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occ location adds
	 */
	@Override
	public List<SezOccLocationAdd> findAll(
		int start, int end,
		OrderByComparator<SezOccLocationAdd> orderByComparator,
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

		List<SezOccLocationAdd> list = null;

		if (useFinderCache) {
			list = (List<SezOccLocationAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCLOCATIONADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCLOCATIONADD;

				sql = sql.concat(SezOccLocationAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccLocationAdd>)QueryUtil.list(
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
	 * Removes all the sez occ location adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccLocationAdd sezOccLocationAdd : findAll()) {
			remove(sezOccLocationAdd);
		}
	}

	/**
	 * Returns the number of sez occ location adds.
	 *
	 * @return the number of sez occ location adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SEZOCCLOCATIONADD);

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
		return "sezOccLocationAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCLOCATIONADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccLocationAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occ location add persistence.
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

		SezOccLocationAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccLocationAddUtil.setPersistence(null);

		entityCache.removeCache(SezOccLocationAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZOCCLOCATIONADD =
		"SELECT sezOccLocationAdd FROM SezOccLocationAdd sezOccLocationAdd";

	private static final String _SQL_SELECT_SEZOCCLOCATIONADD_WHERE =
		"SELECT sezOccLocationAdd FROM SezOccLocationAdd sezOccLocationAdd WHERE ";

	private static final String _SQL_COUNT_SEZOCCLOCATIONADD =
		"SELECT COUNT(sezOccLocationAdd) FROM SezOccLocationAdd sezOccLocationAdd";

	private static final String _SQL_COUNT_SEZOCCLOCATIONADD_WHERE =
		"SELECT COUNT(sezOccLocationAdd) FROM SezOccLocationAdd sezOccLocationAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezOccLocationAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccLocationAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccLocationAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccLocationAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}