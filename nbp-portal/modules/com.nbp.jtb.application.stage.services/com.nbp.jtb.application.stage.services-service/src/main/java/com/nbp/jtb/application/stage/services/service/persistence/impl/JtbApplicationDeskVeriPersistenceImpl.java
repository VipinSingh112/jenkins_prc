/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbApplicationDeskVeriException;
import com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri;
import com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeriTable;
import com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriImpl;
import com.nbp.jtb.application.stage.services.model.impl.JtbApplicationDeskVeriModelImpl;
import com.nbp.jtb.application.stage.services.service.persistence.JtbApplicationDeskVeriPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbApplicationDeskVeriUtil;
import com.nbp.jtb.application.stage.services.service.persistence.impl.constants.JTB_APPLICATION_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the jtb application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {JtbApplicationDeskVeriPersistence.class, BasePersistence.class}
)
public class JtbApplicationDeskVeriPersistenceImpl
	extends BasePersistenceImpl<JtbApplicationDeskVeri>
	implements JtbApplicationDeskVeriPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbApplicationDeskVeriUtil</code> to access the jtb application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbApplicationDeskVeriImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJtbAppDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetJtbAppDV_ById;
	private FinderPath _finderPathCountBygetJtbAppDV_ById;

	/**
	 * Returns all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId) {

		return findBygetJtbAppDV_ById(
			jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of matching jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end) {

		return findBygetJtbAppDV_ById(jtbApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return findBygetJtbAppDV_ById(
			jtbApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJtbAppDV_ById;
				finderArgs = new Object[] {jtbApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtbAppDV_ById;
			finderArgs = new Object[] {
				jtbApplicationId, start, end, orderByComparator
			};
		}

		List<JtbApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbApplicationDeskVeri jtbApplicationDeskVeri : list) {
					if (jtbApplicationId !=
							jtbApplicationDeskVeri.getJtbApplicationId()) {

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

			sb.append(_SQL_SELECT_JTBAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETJTBAPPDV_BYID_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				list = (List<JtbApplicationDeskVeri>)QueryUtil.list(
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
	 * Returns the first jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a matching jtb application desk veri could not be found
	 */
	@Override
	public JtbApplicationDeskVeri findBygetJtbAppDV_ById_First(
			long jtbApplicationId,
			OrderByComparator<JtbApplicationDeskVeri> orderByComparator)
		throws NoSuchJtbApplicationDeskVeriException {

		JtbApplicationDeskVeri jtbApplicationDeskVeri =
			fetchBygetJtbAppDV_ById_First(jtbApplicationId, orderByComparator);

		if (jtbApplicationDeskVeri != null) {
			return jtbApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the first jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application desk veri, or <code>null</code> if a matching jtb application desk veri could not be found
	 */
	@Override
	public JtbApplicationDeskVeri fetchBygetJtbAppDV_ById_First(
		long jtbApplicationId,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		List<JtbApplicationDeskVeri> list = findBygetJtbAppDV_ById(
			jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a matching jtb application desk veri could not be found
	 */
	@Override
	public JtbApplicationDeskVeri findBygetJtbAppDV_ById_Last(
			long jtbApplicationId,
			OrderByComparator<JtbApplicationDeskVeri> orderByComparator)
		throws NoSuchJtbApplicationDeskVeriException {

		JtbApplicationDeskVeri jtbApplicationDeskVeri =
			fetchBygetJtbAppDV_ById_Last(jtbApplicationId, orderByComparator);

		if (jtbApplicationDeskVeri != null) {
			return jtbApplicationDeskVeri;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbApplicationDeskVeriException(sb.toString());
	}

	/**
	 * Returns the last jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application desk veri, or <code>null</code> if a matching jtb application desk veri could not be found
	 */
	@Override
	public JtbApplicationDeskVeri fetchBygetJtbAppDV_ById_Last(
		long jtbApplicationId,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		int count = countBygetJtbAppDV_ById(jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbApplicationDeskVeri> list = findBygetJtbAppDV_ById(
			jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb application desk veris before and after the current jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the current jtb application desk veri
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public JtbApplicationDeskVeri[] findBygetJtbAppDV_ById_PrevAndNext(
			long jtbApplicationDeskVeriId, long jtbApplicationId,
			OrderByComparator<JtbApplicationDeskVeri> orderByComparator)
		throws NoSuchJtbApplicationDeskVeriException {

		JtbApplicationDeskVeri jtbApplicationDeskVeri = findByPrimaryKey(
			jtbApplicationDeskVeriId);

		Session session = null;

		try {
			session = openSession();

			JtbApplicationDeskVeri[] array = new JtbApplicationDeskVeriImpl[3];

			array[0] = getBygetJtbAppDV_ById_PrevAndNext(
				session, jtbApplicationDeskVeri, jtbApplicationId,
				orderByComparator, true);

			array[1] = jtbApplicationDeskVeri;

			array[2] = getBygetJtbAppDV_ById_PrevAndNext(
				session, jtbApplicationDeskVeri, jtbApplicationId,
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

	protected JtbApplicationDeskVeri getBygetJtbAppDV_ById_PrevAndNext(
		Session session, JtbApplicationDeskVeri jtbApplicationDeskVeri,
		long jtbApplicationId,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPLICATIONDESKVERI_WHERE);

		sb.append(_FINDER_COLUMN_GETJTBAPPDV_BYID_JTBAPPLICATIONID_2);

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
			sb.append(JtbApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jtbApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jtbApplicationDeskVeri)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbApplicationDeskVeri> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb application desk veris where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetJtbAppDV_ById(long jtbApplicationId) {
		for (JtbApplicationDeskVeri jtbApplicationDeskVeri :
				findBygetJtbAppDV_ById(
					jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb application desk veris
	 */
	@Override
	public int countBygetJtbAppDV_ById(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJtbAppDV_ById;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATIONDESKVERI_WHERE);

			sb.append(_FINDER_COLUMN_GETJTBAPPDV_BYID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTBAPPDV_BYID_JTBAPPLICATIONID_2 =
			"jtbApplicationDeskVeri.jtbApplicationId = ?";

	public JtbApplicationDeskVeriPersistenceImpl() {
		setModelClass(JtbApplicationDeskVeri.class);

		setModelImplClass(JtbApplicationDeskVeriImpl.class);
		setModelPKClass(long.class);

		setTable(JtbApplicationDeskVeriTable.INSTANCE);
	}

	/**
	 * Caches the jtb application desk veri in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationDeskVeri the jtb application desk veri
	 */
	@Override
	public void cacheResult(JtbApplicationDeskVeri jtbApplicationDeskVeri) {
		entityCache.putResult(
			JtbApplicationDeskVeriImpl.class,
			jtbApplicationDeskVeri.getPrimaryKey(), jtbApplicationDeskVeri);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb application desk veris in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationDeskVeris the jtb application desk veris
	 */
	@Override
	public void cacheResult(
		List<JtbApplicationDeskVeri> jtbApplicationDeskVeris) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbApplicationDeskVeris.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbApplicationDeskVeri jtbApplicationDeskVeri :
				jtbApplicationDeskVeris) {

			if (entityCache.getResult(
					JtbApplicationDeskVeriImpl.class,
					jtbApplicationDeskVeri.getPrimaryKey()) == null) {

				cacheResult(jtbApplicationDeskVeri);
			}
		}
	}

	/**
	 * Clears the cache for all jtb application desk veris.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbApplicationDeskVeriImpl.class);

		finderCache.clearCache(JtbApplicationDeskVeriImpl.class);
	}

	/**
	 * Clears the cache for the jtb application desk veri.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbApplicationDeskVeri jtbApplicationDeskVeri) {
		entityCache.removeResult(
			JtbApplicationDeskVeriImpl.class, jtbApplicationDeskVeri);
	}

	@Override
	public void clearCache(
		List<JtbApplicationDeskVeri> jtbApplicationDeskVeris) {

		for (JtbApplicationDeskVeri jtbApplicationDeskVeri :
				jtbApplicationDeskVeris) {

			entityCache.removeResult(
				JtbApplicationDeskVeriImpl.class, jtbApplicationDeskVeri);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbApplicationDeskVeriImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbApplicationDeskVeriImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new jtb application desk veri with the primary key. Does not add the jtb application desk veri to the database.
	 *
	 * @param jtbApplicationDeskVeriId the primary key for the new jtb application desk veri
	 * @return the new jtb application desk veri
	 */
	@Override
	public JtbApplicationDeskVeri create(long jtbApplicationDeskVeriId) {
		JtbApplicationDeskVeri jtbApplicationDeskVeri =
			new JtbApplicationDeskVeriImpl();

		jtbApplicationDeskVeri.setNew(true);
		jtbApplicationDeskVeri.setPrimaryKey(jtbApplicationDeskVeriId);

		jtbApplicationDeskVeri.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbApplicationDeskVeri;
	}

	/**
	 * Removes the jtb application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri that was removed
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public JtbApplicationDeskVeri remove(long jtbApplicationDeskVeriId)
		throws NoSuchJtbApplicationDeskVeriException {

		return remove((Serializable)jtbApplicationDeskVeriId);
	}

	/**
	 * Removes the jtb application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb application desk veri
	 * @return the jtb application desk veri that was removed
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public JtbApplicationDeskVeri remove(Serializable primaryKey)
		throws NoSuchJtbApplicationDeskVeriException {

		Session session = null;

		try {
			session = openSession();

			JtbApplicationDeskVeri jtbApplicationDeskVeri =
				(JtbApplicationDeskVeri)session.get(
					JtbApplicationDeskVeriImpl.class, primaryKey);

			if (jtbApplicationDeskVeri == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbApplicationDeskVeriException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbApplicationDeskVeri);
		}
		catch (NoSuchJtbApplicationDeskVeriException noSuchEntityException) {
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
	protected JtbApplicationDeskVeri removeImpl(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbApplicationDeskVeri)) {
				jtbApplicationDeskVeri = (JtbApplicationDeskVeri)session.get(
					JtbApplicationDeskVeriImpl.class,
					jtbApplicationDeskVeri.getPrimaryKeyObj());
			}

			if (jtbApplicationDeskVeri != null) {
				session.delete(jtbApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbApplicationDeskVeri != null) {
			clearCache(jtbApplicationDeskVeri);
		}

		return jtbApplicationDeskVeri;
	}

	@Override
	public JtbApplicationDeskVeri updateImpl(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		boolean isNew = jtbApplicationDeskVeri.isNew();

		if (!(jtbApplicationDeskVeri instanceof
				JtbApplicationDeskVeriModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbApplicationDeskVeri.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbApplicationDeskVeri);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbApplicationDeskVeri proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbApplicationDeskVeri implementation " +
					jtbApplicationDeskVeri.getClass());
		}

		JtbApplicationDeskVeriModelImpl jtbApplicationDeskVeriModelImpl =
			(JtbApplicationDeskVeriModelImpl)jtbApplicationDeskVeri;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbApplicationDeskVeri.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbApplicationDeskVeri.setCreateDate(date);
			}
			else {
				jtbApplicationDeskVeri.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbApplicationDeskVeriModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbApplicationDeskVeri.setModifiedDate(date);
			}
			else {
				jtbApplicationDeskVeri.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbApplicationDeskVeri);
			}
			else {
				jtbApplicationDeskVeri = (JtbApplicationDeskVeri)session.merge(
					jtbApplicationDeskVeri);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbApplicationDeskVeriImpl.class, jtbApplicationDeskVeriModelImpl,
			false, true);

		if (isNew) {
			jtbApplicationDeskVeri.setNew(false);
		}

		jtbApplicationDeskVeri.resetOriginalValues();

		return jtbApplicationDeskVeri;
	}

	/**
	 * Returns the jtb application desk veri with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb application desk veri
	 * @return the jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public JtbApplicationDeskVeri findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbApplicationDeskVeriException {

		JtbApplicationDeskVeri jtbApplicationDeskVeri = fetchByPrimaryKey(
			primaryKey);

		if (jtbApplicationDeskVeri == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbApplicationDeskVeriException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbApplicationDeskVeri;
	}

	/**
	 * Returns the jtb application desk veri with the primary key or throws a <code>NoSuchJtbApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public JtbApplicationDeskVeri findByPrimaryKey(
			long jtbApplicationDeskVeriId)
		throws NoSuchJtbApplicationDeskVeriException {

		return findByPrimaryKey((Serializable)jtbApplicationDeskVeriId);
	}

	/**
	 * Returns the jtb application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri, or <code>null</code> if a jtb application desk veri with the primary key could not be found
	 */
	@Override
	public JtbApplicationDeskVeri fetchByPrimaryKey(
		long jtbApplicationDeskVeriId) {

		return fetchByPrimaryKey((Serializable)jtbApplicationDeskVeriId);
	}

	/**
	 * Returns all the jtb application desk veris.
	 *
	 * @return the jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb application desk veris
	 */
	@Override
	public List<JtbApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator,
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

		List<JtbApplicationDeskVeri> list = null;

		if (useFinderCache) {
			list = (List<JtbApplicationDeskVeri>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBAPPLICATIONDESKVERI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBAPPLICATIONDESKVERI;

				sql = sql.concat(JtbApplicationDeskVeriModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbApplicationDeskVeri>)QueryUtil.list(
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
	 * Removes all the jtb application desk veris from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbApplicationDeskVeri jtbApplicationDeskVeri : findAll()) {
			remove(jtbApplicationDeskVeri);
		}
	}

	/**
	 * Returns the number of jtb application desk veris.
	 *
	 * @return the number of jtb application desk veris
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_JTBAPPLICATIONDESKVERI);

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
		return "jtbApplicationDeskVeriId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBAPPLICATIONDESKVERI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbApplicationDeskVeriModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb application desk veri persistence.
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

		_finderPathWithPaginationFindBygetJtbAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtbAppDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jtbApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJtbAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJtbAppDV_ById",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJtbAppDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbAppDV_ById", new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		_setJtbApplicationDeskVeriUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setJtbApplicationDeskVeriUtilPersistence(null);

		entityCache.removeCache(JtbApplicationDeskVeriImpl.class.getName());
	}

	private void _setJtbApplicationDeskVeriUtilPersistence(
		JtbApplicationDeskVeriPersistence jtbApplicationDeskVeriPersistence) {

		try {
			Field field = JtbApplicationDeskVeriUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, jtbApplicationDeskVeriPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBAPPLICATIONDESKVERI =
		"SELECT jtbApplicationDeskVeri FROM JtbApplicationDeskVeri jtbApplicationDeskVeri";

	private static final String _SQL_SELECT_JTBAPPLICATIONDESKVERI_WHERE =
		"SELECT jtbApplicationDeskVeri FROM JtbApplicationDeskVeri jtbApplicationDeskVeri WHERE ";

	private static final String _SQL_COUNT_JTBAPPLICATIONDESKVERI =
		"SELECT COUNT(jtbApplicationDeskVeri) FROM JtbApplicationDeskVeri jtbApplicationDeskVeri";

	private static final String _SQL_COUNT_JTBAPPLICATIONDESKVERI_WHERE =
		"SELECT COUNT(jtbApplicationDeskVeri) FROM JtbApplicationDeskVeri jtbApplicationDeskVeri WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbApplicationDeskVeri.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbApplicationDeskVeri exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbApplicationDeskVeri exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbApplicationDeskVeriPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private JtbApplicationDeskVeriModelArgumentsResolver
		_jtbApplicationDeskVeriModelArgumentsResolver;

}