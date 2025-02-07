/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchPreferredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditorTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.PreferredCreditorImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.PreferredCreditorModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.PreferredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.PreferredCreditorUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the preferred creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PreferredCreditorPersistence.class)
public class PreferredCreditorPersistenceImpl
	extends BasePersistenceImpl<PreferredCreditor>
	implements PreferredCreditorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PreferredCreditorUtil</code> to access the preferred creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PreferredCreditorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of matching preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<PreferredCreditor> list = null;

		if (useFinderCache) {
			list = (List<PreferredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PreferredCreditor preferredCreditor : list) {
					if (osiInsolvencyId !=
							preferredCreditor.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_PREFERREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PreferredCreditorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<PreferredCreditor>)QueryUtil.list(
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
	 * Returns the first preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching preferred creditor
	 * @throws NoSuchPreferredCreditorException if a matching preferred creditor could not be found
	 */
	@Override
	public PreferredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<PreferredCreditor> orderByComparator)
		throws NoSuchPreferredCreditorException {

		PreferredCreditor preferredCreditor = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (preferredCreditor != null) {
			return preferredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchPreferredCreditorException(sb.toString());
	}

	/**
	 * Returns the first preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching preferred creditor, or <code>null</code> if a matching preferred creditor could not be found
	 */
	@Override
	public PreferredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		List<PreferredCreditor> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching preferred creditor
	 * @throws NoSuchPreferredCreditorException if a matching preferred creditor could not be found
	 */
	@Override
	public PreferredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<PreferredCreditor> orderByComparator)
		throws NoSuchPreferredCreditorException {

		PreferredCreditor preferredCreditor = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (preferredCreditor != null) {
			return preferredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchPreferredCreditorException(sb.toString());
	}

	/**
	 * Returns the last preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching preferred creditor, or <code>null</code> if a matching preferred creditor could not be found
	 */
	@Override
	public PreferredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<PreferredCreditor> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the preferred creditors before and after the current preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param preferredCreditorId the primary key of the current preferred creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public PreferredCreditor[] findBygetOsiById_PrevAndNext(
			long preferredCreditorId, long osiInsolvencyId,
			OrderByComparator<PreferredCreditor> orderByComparator)
		throws NoSuchPreferredCreditorException {

		PreferredCreditor preferredCreditor = findByPrimaryKey(
			preferredCreditorId);

		Session session = null;

		try {
			session = openSession();

			PreferredCreditor[] array = new PreferredCreditorImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, preferredCreditor, osiInsolvencyId, orderByComparator,
				true);

			array[1] = preferredCreditor;

			array[2] = getBygetOsiById_PrevAndNext(
				session, preferredCreditor, osiInsolvencyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PreferredCreditor getBygetOsiById_PrevAndNext(
		Session session, PreferredCreditor preferredCreditor,
		long osiInsolvencyId,
		OrderByComparator<PreferredCreditor> orderByComparator,
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

		sb.append(_SQL_SELECT_PREFERREDCREDITOR_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(PreferredCreditorModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						preferredCreditor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PreferredCreditor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the preferred creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (PreferredCreditor preferredCreditor :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(preferredCreditor);
		}
	}

	/**
	 * Returns the number of preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching preferred creditors
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PREFERREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"preferredCreditor.osiInsolvencyId = ?";

	public PreferredCreditorPersistenceImpl() {
		setModelClass(PreferredCreditor.class);

		setModelImplClass(PreferredCreditorImpl.class);
		setModelPKClass(long.class);

		setTable(PreferredCreditorTable.INSTANCE);
	}

	/**
	 * Caches the preferred creditor in the entity cache if it is enabled.
	 *
	 * @param preferredCreditor the preferred creditor
	 */
	@Override
	public void cacheResult(PreferredCreditor preferredCreditor) {
		entityCache.putResult(
			PreferredCreditorImpl.class, preferredCreditor.getPrimaryKey(),
			preferredCreditor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the preferred creditors in the entity cache if it is enabled.
	 *
	 * @param preferredCreditors the preferred creditors
	 */
	@Override
	public void cacheResult(List<PreferredCreditor> preferredCreditors) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (preferredCreditors.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PreferredCreditor preferredCreditor : preferredCreditors) {
			if (entityCache.getResult(
					PreferredCreditorImpl.class,
					preferredCreditor.getPrimaryKey()) == null) {

				cacheResult(preferredCreditor);
			}
		}
	}

	/**
	 * Clears the cache for all preferred creditors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PreferredCreditorImpl.class);

		finderCache.clearCache(PreferredCreditorImpl.class);
	}

	/**
	 * Clears the cache for the preferred creditor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PreferredCreditor preferredCreditor) {
		entityCache.removeResult(
			PreferredCreditorImpl.class, preferredCreditor);
	}

	@Override
	public void clearCache(List<PreferredCreditor> preferredCreditors) {
		for (PreferredCreditor preferredCreditor : preferredCreditors) {
			entityCache.removeResult(
				PreferredCreditorImpl.class, preferredCreditor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PreferredCreditorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PreferredCreditorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new preferred creditor with the primary key. Does not add the preferred creditor to the database.
	 *
	 * @param preferredCreditorId the primary key for the new preferred creditor
	 * @return the new preferred creditor
	 */
	@Override
	public PreferredCreditor create(long preferredCreditorId) {
		PreferredCreditor preferredCreditor = new PreferredCreditorImpl();

		preferredCreditor.setNew(true);
		preferredCreditor.setPrimaryKey(preferredCreditorId);

		preferredCreditor.setCompanyId(CompanyThreadLocal.getCompanyId());

		return preferredCreditor;
	}

	/**
	 * Removes the preferred creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor that was removed
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public PreferredCreditor remove(long preferredCreditorId)
		throws NoSuchPreferredCreditorException {

		return remove((Serializable)preferredCreditorId);
	}

	/**
	 * Removes the preferred creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the preferred creditor
	 * @return the preferred creditor that was removed
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public PreferredCreditor remove(Serializable primaryKey)
		throws NoSuchPreferredCreditorException {

		Session session = null;

		try {
			session = openSession();

			PreferredCreditor preferredCreditor =
				(PreferredCreditor)session.get(
					PreferredCreditorImpl.class, primaryKey);

			if (preferredCreditor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPreferredCreditorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(preferredCreditor);
		}
		catch (NoSuchPreferredCreditorException noSuchEntityException) {
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
	protected PreferredCreditor removeImpl(
		PreferredCreditor preferredCreditor) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(preferredCreditor)) {
				preferredCreditor = (PreferredCreditor)session.get(
					PreferredCreditorImpl.class,
					preferredCreditor.getPrimaryKeyObj());
			}

			if (preferredCreditor != null) {
				session.delete(preferredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (preferredCreditor != null) {
			clearCache(preferredCreditor);
		}

		return preferredCreditor;
	}

	@Override
	public PreferredCreditor updateImpl(PreferredCreditor preferredCreditor) {
		boolean isNew = preferredCreditor.isNew();

		if (!(preferredCreditor instanceof PreferredCreditorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(preferredCreditor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					preferredCreditor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in preferredCreditor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PreferredCreditor implementation " +
					preferredCreditor.getClass());
		}

		PreferredCreditorModelImpl preferredCreditorModelImpl =
			(PreferredCreditorModelImpl)preferredCreditor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (preferredCreditor.getCreateDate() == null)) {
			if (serviceContext == null) {
				preferredCreditor.setCreateDate(date);
			}
			else {
				preferredCreditor.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!preferredCreditorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				preferredCreditor.setModifiedDate(date);
			}
			else {
				preferredCreditor.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(preferredCreditor);
			}
			else {
				preferredCreditor = (PreferredCreditor)session.merge(
					preferredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PreferredCreditorImpl.class, preferredCreditorModelImpl, false,
			true);

		if (isNew) {
			preferredCreditor.setNew(false);
		}

		preferredCreditor.resetOriginalValues();

		return preferredCreditor;
	}

	/**
	 * Returns the preferred creditor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the preferred creditor
	 * @return the preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public PreferredCreditor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPreferredCreditorException {

		PreferredCreditor preferredCreditor = fetchByPrimaryKey(primaryKey);

		if (preferredCreditor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPreferredCreditorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return preferredCreditor;
	}

	/**
	 * Returns the preferred creditor with the primary key or throws a <code>NoSuchPreferredCreditorException</code> if it could not be found.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	@Override
	public PreferredCreditor findByPrimaryKey(long preferredCreditorId)
		throws NoSuchPreferredCreditorException {

		return findByPrimaryKey((Serializable)preferredCreditorId);
	}

	/**
	 * Returns the preferred creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor, or <code>null</code> if a preferred creditor with the primary key could not be found
	 */
	@Override
	public PreferredCreditor fetchByPrimaryKey(long preferredCreditorId) {
		return fetchByPrimaryKey((Serializable)preferredCreditorId);
	}

	/**
	 * Returns all the preferred creditors.
	 *
	 * @return the preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findAll(
		int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of preferred creditors
	 */
	@Override
	public List<PreferredCreditor> findAll(
		int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator,
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

		List<PreferredCreditor> list = null;

		if (useFinderCache) {
			list = (List<PreferredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PREFERREDCREDITOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PREFERREDCREDITOR;

				sql = sql.concat(PreferredCreditorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PreferredCreditor>)QueryUtil.list(
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
	 * Removes all the preferred creditors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PreferredCreditor preferredCreditor : findAll()) {
			remove(preferredCreditor);
		}
	}

	/**
	 * Returns the number of preferred creditors.
	 *
	 * @return the number of preferred creditors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PREFERREDCREDITOR);

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
		return "preferredCreditorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PREFERREDCREDITOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PreferredCreditorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the preferred creditor persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		PreferredCreditorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PreferredCreditorUtil.setPersistence(null);

		entityCache.removeCache(PreferredCreditorImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PREFERREDCREDITOR =
		"SELECT preferredCreditor FROM PreferredCreditor preferredCreditor";

	private static final String _SQL_SELECT_PREFERREDCREDITOR_WHERE =
		"SELECT preferredCreditor FROM PreferredCreditor preferredCreditor WHERE ";

	private static final String _SQL_COUNT_PREFERREDCREDITOR =
		"SELECT COUNT(preferredCreditor) FROM PreferredCreditor preferredCreditor";

	private static final String _SQL_COUNT_PREFERREDCREDITOR_WHERE =
		"SELECT COUNT(preferredCreditor) FROM PreferredCreditor preferredCreditor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "preferredCreditor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PreferredCreditor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PreferredCreditor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PreferredCreditorPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}