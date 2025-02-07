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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevSharePleaseStateAddException;
import com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAdd;
import com.nbp.sez.status.application.form.service.model.SezDevSharePleaseStateAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevSharePleaseStateAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevSharePleaseStateAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevSharePleaseStateAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevSharePleaseStateAddUtil;
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
 * The persistence implementation for the sez dev share please state add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevSharePleaseStateAddPersistence.class)
public class SezDevSharePleaseStateAddPersistenceImpl
	extends BasePersistenceImpl<SezDevSharePleaseStateAdd>
	implements SezDevSharePleaseStateAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevSharePleaseStateAddUtil</code> to access the sez dev share please state add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevSharePleaseStateAddImpl.class.getName();

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
	 * Returns all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of matching sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator,
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

		List<SezDevSharePleaseStateAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevSharePleaseStateAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd :
						list) {

					if (sezStatusApplicationId !=
							sezDevSharePleaseStateAdd.
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

			sb.append(_SQL_SELECT_SEZDEVSHAREPLEASESTATEADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevSharePleaseStateAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevSharePleaseStateAdd>)QueryUtil.list(
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
	 * Returns the first sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a matching sez dev share please state add could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator)
		throws NoSuchSezDevSharePleaseStateAddException {

		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevSharePleaseStateAdd != null) {
			return sezDevSharePleaseStateAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevSharePleaseStateAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share please state add, or <code>null</code> if a matching sez dev share please state add could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		List<SezDevSharePleaseStateAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a matching sez dev share please state add could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator)
		throws NoSuchSezDevSharePleaseStateAddException {

		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevSharePleaseStateAdd != null) {
			return sezDevSharePleaseStateAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevSharePleaseStateAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share please state add, or <code>null</code> if a matching sez dev share please state add could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevSharePleaseStateAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev share please state adds before and after the current sez dev share please state add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the current sez dev share please state add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevPleaseStateAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator)
		throws NoSuchSezDevSharePleaseStateAddException {

		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd = findByPrimaryKey(
			sezDevPleaseStateAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevSharePleaseStateAdd[] array =
				new SezDevSharePleaseStateAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevSharePleaseStateAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevSharePleaseStateAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevSharePleaseStateAdd, sezStatusApplicationId,
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

	protected SezDevSharePleaseStateAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVSHAREPLEASESTATEADD_WHERE);

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
			sb.append(SezDevSharePleaseStateAddModelImpl.ORDER_BY_JPQL);
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
						sezDevSharePleaseStateAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevSharePleaseStateAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev share please state adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevSharePleaseStateAdd);
		}
	}

	/**
	 * Returns the number of sez dev share please state adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share please state adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVSHAREPLEASESTATEADD_WHERE);

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
			"sezDevSharePleaseStateAdd.sezStatusApplicationId = ?";

	public SezDevSharePleaseStateAddPersistenceImpl() {
		setModelClass(SezDevSharePleaseStateAdd.class);

		setModelImplClass(SezDevSharePleaseStateAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevSharePleaseStateAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev share please state add in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePleaseStateAdd the sez dev share please state add
	 */
	@Override
	public void cacheResult(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		entityCache.putResult(
			SezDevSharePleaseStateAddImpl.class,
			sezDevSharePleaseStateAdd.getPrimaryKey(),
			sezDevSharePleaseStateAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev share please state adds in the entity cache if it is enabled.
	 *
	 * @param sezDevSharePleaseStateAdds the sez dev share please state adds
	 */
	@Override
	public void cacheResult(
		List<SezDevSharePleaseStateAdd> sezDevSharePleaseStateAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevSharePleaseStateAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd :
				sezDevSharePleaseStateAdds) {

			if (entityCache.getResult(
					SezDevSharePleaseStateAddImpl.class,
					sezDevSharePleaseStateAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevSharePleaseStateAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev share please state adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevSharePleaseStateAddImpl.class);

		finderCache.clearCache(SezDevSharePleaseStateAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev share please state add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		entityCache.removeResult(
			SezDevSharePleaseStateAddImpl.class, sezDevSharePleaseStateAdd);
	}

	@Override
	public void clearCache(
		List<SezDevSharePleaseStateAdd> sezDevSharePleaseStateAdds) {

		for (SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd :
				sezDevSharePleaseStateAdds) {

			entityCache.removeResult(
				SezDevSharePleaseStateAddImpl.class, sezDevSharePleaseStateAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevSharePleaseStateAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevSharePleaseStateAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev share please state add with the primary key. Does not add the sez dev share please state add to the database.
	 *
	 * @param sezDevPleaseStateAddId the primary key for the new sez dev share please state add
	 * @return the new sez dev share please state add
	 */
	@Override
	public SezDevSharePleaseStateAdd create(long sezDevPleaseStateAddId) {
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd =
			new SezDevSharePleaseStateAddImpl();

		sezDevSharePleaseStateAdd.setNew(true);
		sezDevSharePleaseStateAdd.setPrimaryKey(sezDevPleaseStateAddId);

		sezDevSharePleaseStateAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevSharePleaseStateAdd;
	}

	/**
	 * Removes the sez dev share please state add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add that was removed
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd remove(long sezDevPleaseStateAddId)
		throws NoSuchSezDevSharePleaseStateAddException {

		return remove((Serializable)sezDevPleaseStateAddId);
	}

	/**
	 * Removes the sez dev share please state add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev share please state add
	 * @return the sez dev share please state add that was removed
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd remove(Serializable primaryKey)
		throws NoSuchSezDevSharePleaseStateAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd =
				(SezDevSharePleaseStateAdd)session.get(
					SezDevSharePleaseStateAddImpl.class, primaryKey);

			if (sezDevSharePleaseStateAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevSharePleaseStateAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevSharePleaseStateAdd);
		}
		catch (NoSuchSezDevSharePleaseStateAddException noSuchEntityException) {
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
	protected SezDevSharePleaseStateAdd removeImpl(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevSharePleaseStateAdd)) {
				sezDevSharePleaseStateAdd =
					(SezDevSharePleaseStateAdd)session.get(
						SezDevSharePleaseStateAddImpl.class,
						sezDevSharePleaseStateAdd.getPrimaryKeyObj());
			}

			if (sezDevSharePleaseStateAdd != null) {
				session.delete(sezDevSharePleaseStateAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevSharePleaseStateAdd != null) {
			clearCache(sezDevSharePleaseStateAdd);
		}

		return sezDevSharePleaseStateAdd;
	}

	@Override
	public SezDevSharePleaseStateAdd updateImpl(
		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd) {

		boolean isNew = sezDevSharePleaseStateAdd.isNew();

		if (!(sezDevSharePleaseStateAdd instanceof
				SezDevSharePleaseStateAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevSharePleaseStateAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevSharePleaseStateAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevSharePleaseStateAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevSharePleaseStateAdd implementation " +
					sezDevSharePleaseStateAdd.getClass());
		}

		SezDevSharePleaseStateAddModelImpl sezDevSharePleaseStateAddModelImpl =
			(SezDevSharePleaseStateAddModelImpl)sezDevSharePleaseStateAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevSharePleaseStateAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevSharePleaseStateAdd.setCreateDate(date);
			}
			else {
				sezDevSharePleaseStateAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevSharePleaseStateAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevSharePleaseStateAdd.setModifiedDate(date);
			}
			else {
				sezDevSharePleaseStateAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevSharePleaseStateAdd);
			}
			else {
				sezDevSharePleaseStateAdd =
					(SezDevSharePleaseStateAdd)session.merge(
						sezDevSharePleaseStateAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevSharePleaseStateAddImpl.class,
			sezDevSharePleaseStateAddModelImpl, false, true);

		if (isNew) {
			sezDevSharePleaseStateAdd.setNew(false);
		}

		sezDevSharePleaseStateAdd.resetOriginalValues();

		return sezDevSharePleaseStateAdd;
	}

	/**
	 * Returns the sez dev share please state add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev share please state add
	 * @return the sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevSharePleaseStateAddException {

		SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd = fetchByPrimaryKey(
			primaryKey);

		if (sezDevSharePleaseStateAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevSharePleaseStateAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevSharePleaseStateAdd;
	}

	/**
	 * Returns the sez dev share please state add with the primary key or throws a <code>NoSuchSezDevSharePleaseStateAddException</code> if it could not be found.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add
	 * @throws NoSuchSezDevSharePleaseStateAddException if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd findByPrimaryKey(
			long sezDevPleaseStateAddId)
		throws NoSuchSezDevSharePleaseStateAddException {

		return findByPrimaryKey((Serializable)sezDevPleaseStateAddId);
	}

	/**
	 * Returns the sez dev share please state add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevPleaseStateAddId the primary key of the sez dev share please state add
	 * @return the sez dev share please state add, or <code>null</code> if a sez dev share please state add with the primary key could not be found
	 */
	@Override
	public SezDevSharePleaseStateAdd fetchByPrimaryKey(
		long sezDevPleaseStateAddId) {

		return fetchByPrimaryKey((Serializable)sezDevPleaseStateAddId);
	}

	/**
	 * Returns all the sez dev share please state adds.
	 *
	 * @return the sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @return the range of sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share please state adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevSharePleaseStateAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share please state adds
	 * @param end the upper bound of the range of sez dev share please state adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share please state adds
	 */
	@Override
	public List<SezDevSharePleaseStateAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevSharePleaseStateAdd> orderByComparator,
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

		List<SezDevSharePleaseStateAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevSharePleaseStateAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVSHAREPLEASESTATEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVSHAREPLEASESTATEADD;

				sql = sql.concat(
					SezDevSharePleaseStateAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevSharePleaseStateAdd>)QueryUtil.list(
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
	 * Removes all the sez dev share please state adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd : findAll()) {
			remove(sezDevSharePleaseStateAdd);
		}
	}

	/**
	 * Returns the number of sez dev share please state adds.
	 *
	 * @return the number of sez dev share please state adds
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
					_SQL_COUNT_SEZDEVSHAREPLEASESTATEADD);

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
		return "sezDevPleaseStateAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVSHAREPLEASESTATEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevSharePleaseStateAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev share please state add persistence.
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

		SezDevSharePleaseStateAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevSharePleaseStateAddUtil.setPersistence(null);

		entityCache.removeCache(SezDevSharePleaseStateAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVSHAREPLEASESTATEADD =
		"SELECT sezDevSharePleaseStateAdd FROM SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd";

	private static final String _SQL_SELECT_SEZDEVSHAREPLEASESTATEADD_WHERE =
		"SELECT sezDevSharePleaseStateAdd FROM SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVSHAREPLEASESTATEADD =
		"SELECT COUNT(sezDevSharePleaseStateAdd) FROM SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd";

	private static final String _SQL_COUNT_SEZDEVSHAREPLEASESTATEADD_WHERE =
		"SELECT COUNT(sezDevSharePleaseStateAdd) FROM SezDevSharePleaseStateAdd sezDevSharePleaseStateAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevSharePleaseStateAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevSharePleaseStateAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevSharePleaseStateAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevSharePleaseStateAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}