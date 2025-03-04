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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchDirectorsFormException;
import com.nbp.osi.insolvency.application.form.services.model.DirectorsForm;
import com.nbp.osi.insolvency.application.form.services.model.DirectorsFormTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.DirectorsFormModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.DirectorsFormPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.DirectorsFormUtil;
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
 * The persistence implementation for the directors form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DirectorsFormPersistence.class)
public class DirectorsFormPersistenceImpl
	extends BasePersistenceImpl<DirectorsForm>
	implements DirectorsFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DirectorsFormUtil</code> to access the directors form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DirectorsFormImpl.class.getName();

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
	 * Returns all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching directors forms
	 */
	@Override
	public List<DirectorsForm> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of matching directors forms
	 */
	@Override
	public List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching directors forms
	 */
	@Override
	public List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the directors forms where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching directors forms
	 */
	@Override
	public List<DirectorsForm> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator,
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

		List<DirectorsForm> list = null;

		if (useFinderCache) {
			list = (List<DirectorsForm>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DirectorsForm directorsForm : list) {
					if (osiInsolvencyId != directorsForm.getOsiInsolvencyId()) {
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

			sb.append(_SQL_SELECT_DIRECTORSFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DirectorsFormModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<DirectorsForm>)QueryUtil.list(
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
	 * Returns the first directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching directors form
	 * @throws NoSuchDirectorsFormException if a matching directors form could not be found
	 */
	@Override
	public DirectorsForm findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<DirectorsForm> orderByComparator)
		throws NoSuchDirectorsFormException {

		DirectorsForm directorsForm = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (directorsForm != null) {
			return directorsForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchDirectorsFormException(sb.toString());
	}

	/**
	 * Returns the first directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching directors form, or <code>null</code> if a matching directors form could not be found
	 */
	@Override
	public DirectorsForm fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<DirectorsForm> orderByComparator) {

		List<DirectorsForm> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching directors form
	 * @throws NoSuchDirectorsFormException if a matching directors form could not be found
	 */
	@Override
	public DirectorsForm findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<DirectorsForm> orderByComparator)
		throws NoSuchDirectorsFormException {

		DirectorsForm directorsForm = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (directorsForm != null) {
			return directorsForm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchDirectorsFormException(sb.toString());
	}

	/**
	 * Returns the last directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching directors form, or <code>null</code> if a matching directors form could not be found
	 */
	@Override
	public DirectorsForm fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<DirectorsForm> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<DirectorsForm> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the directors forms before and after the current directors form in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param directorsFormId the primary key of the current directors form
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	@Override
	public DirectorsForm[] findBygetOsiById_PrevAndNext(
			long directorsFormId, long osiInsolvencyId,
			OrderByComparator<DirectorsForm> orderByComparator)
		throws NoSuchDirectorsFormException {

		DirectorsForm directorsForm = findByPrimaryKey(directorsFormId);

		Session session = null;

		try {
			session = openSession();

			DirectorsForm[] array = new DirectorsFormImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, directorsForm, osiInsolvencyId, orderByComparator,
				true);

			array[1] = directorsForm;

			array[2] = getBygetOsiById_PrevAndNext(
				session, directorsForm, osiInsolvencyId, orderByComparator,
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

	protected DirectorsForm getBygetOsiById_PrevAndNext(
		Session session, DirectorsForm directorsForm, long osiInsolvencyId,
		OrderByComparator<DirectorsForm> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DIRECTORSFORM_WHERE);

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
			sb.append(DirectorsFormModelImpl.ORDER_BY_JPQL);
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
						directorsForm)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DirectorsForm> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the directors forms where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (DirectorsForm directorsForm :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(directorsForm);
		}
	}

	/**
	 * Returns the number of directors forms where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching directors forms
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DIRECTORSFORM_WHERE);

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
		"directorsForm.osiInsolvencyId = ?";

	public DirectorsFormPersistenceImpl() {
		setModelClass(DirectorsForm.class);

		setModelImplClass(DirectorsFormImpl.class);
		setModelPKClass(long.class);

		setTable(DirectorsFormTable.INSTANCE);
	}

	/**
	 * Caches the directors form in the entity cache if it is enabled.
	 *
	 * @param directorsForm the directors form
	 */
	@Override
	public void cacheResult(DirectorsForm directorsForm) {
		entityCache.putResult(
			DirectorsFormImpl.class, directorsForm.getPrimaryKey(),
			directorsForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the directors forms in the entity cache if it is enabled.
	 *
	 * @param directorsForms the directors forms
	 */
	@Override
	public void cacheResult(List<DirectorsForm> directorsForms) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (directorsForms.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DirectorsForm directorsForm : directorsForms) {
			if (entityCache.getResult(
					DirectorsFormImpl.class, directorsForm.getPrimaryKey()) ==
						null) {

				cacheResult(directorsForm);
			}
		}
	}

	/**
	 * Clears the cache for all directors forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DirectorsFormImpl.class);

		finderCache.clearCache(DirectorsFormImpl.class);
	}

	/**
	 * Clears the cache for the directors form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DirectorsForm directorsForm) {
		entityCache.removeResult(DirectorsFormImpl.class, directorsForm);
	}

	@Override
	public void clearCache(List<DirectorsForm> directorsForms) {
		for (DirectorsForm directorsForm : directorsForms) {
			entityCache.removeResult(DirectorsFormImpl.class, directorsForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DirectorsFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DirectorsFormImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new directors form with the primary key. Does not add the directors form to the database.
	 *
	 * @param directorsFormId the primary key for the new directors form
	 * @return the new directors form
	 */
	@Override
	public DirectorsForm create(long directorsFormId) {
		DirectorsForm directorsForm = new DirectorsFormImpl();

		directorsForm.setNew(true);
		directorsForm.setPrimaryKey(directorsFormId);

		directorsForm.setCompanyId(CompanyThreadLocal.getCompanyId());

		return directorsForm;
	}

	/**
	 * Removes the directors form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form that was removed
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	@Override
	public DirectorsForm remove(long directorsFormId)
		throws NoSuchDirectorsFormException {

		return remove((Serializable)directorsFormId);
	}

	/**
	 * Removes the directors form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the directors form
	 * @return the directors form that was removed
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	@Override
	public DirectorsForm remove(Serializable primaryKey)
		throws NoSuchDirectorsFormException {

		Session session = null;

		try {
			session = openSession();

			DirectorsForm directorsForm = (DirectorsForm)session.get(
				DirectorsFormImpl.class, primaryKey);

			if (directorsForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDirectorsFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(directorsForm);
		}
		catch (NoSuchDirectorsFormException noSuchEntityException) {
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
	protected DirectorsForm removeImpl(DirectorsForm directorsForm) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(directorsForm)) {
				directorsForm = (DirectorsForm)session.get(
					DirectorsFormImpl.class, directorsForm.getPrimaryKeyObj());
			}

			if (directorsForm != null) {
				session.delete(directorsForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (directorsForm != null) {
			clearCache(directorsForm);
		}

		return directorsForm;
	}

	@Override
	public DirectorsForm updateImpl(DirectorsForm directorsForm) {
		boolean isNew = directorsForm.isNew();

		if (!(directorsForm instanceof DirectorsFormModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(directorsForm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					directorsForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in directorsForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DirectorsForm implementation " +
					directorsForm.getClass());
		}

		DirectorsFormModelImpl directorsFormModelImpl =
			(DirectorsFormModelImpl)directorsForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (directorsForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				directorsForm.setCreateDate(date);
			}
			else {
				directorsForm.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!directorsFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				directorsForm.setModifiedDate(date);
			}
			else {
				directorsForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(directorsForm);
			}
			else {
				directorsForm = (DirectorsForm)session.merge(directorsForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DirectorsFormImpl.class, directorsFormModelImpl, false, true);

		if (isNew) {
			directorsForm.setNew(false);
		}

		directorsForm.resetOriginalValues();

		return directorsForm;
	}

	/**
	 * Returns the directors form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the directors form
	 * @return the directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	@Override
	public DirectorsForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDirectorsFormException {

		DirectorsForm directorsForm = fetchByPrimaryKey(primaryKey);

		if (directorsForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDirectorsFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return directorsForm;
	}

	/**
	 * Returns the directors form with the primary key or throws a <code>NoSuchDirectorsFormException</code> if it could not be found.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form
	 * @throws NoSuchDirectorsFormException if a directors form with the primary key could not be found
	 */
	@Override
	public DirectorsForm findByPrimaryKey(long directorsFormId)
		throws NoSuchDirectorsFormException {

		return findByPrimaryKey((Serializable)directorsFormId);
	}

	/**
	 * Returns the directors form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param directorsFormId the primary key of the directors form
	 * @return the directors form, or <code>null</code> if a directors form with the primary key could not be found
	 */
	@Override
	public DirectorsForm fetchByPrimaryKey(long directorsFormId) {
		return fetchByPrimaryKey((Serializable)directorsFormId);
	}

	/**
	 * Returns all the directors forms.
	 *
	 * @return the directors forms
	 */
	@Override
	public List<DirectorsForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @return the range of directors forms
	 */
	@Override
	public List<DirectorsForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of directors forms
	 */
	@Override
	public List<DirectorsForm> findAll(
		int start, int end,
		OrderByComparator<DirectorsForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the directors forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DirectorsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of directors forms
	 * @param end the upper bound of the range of directors forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of directors forms
	 */
	@Override
	public List<DirectorsForm> findAll(
		int start, int end, OrderByComparator<DirectorsForm> orderByComparator,
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

		List<DirectorsForm> list = null;

		if (useFinderCache) {
			list = (List<DirectorsForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DIRECTORSFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DIRECTORSFORM;

				sql = sql.concat(DirectorsFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DirectorsForm>)QueryUtil.list(
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
	 * Removes all the directors forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DirectorsForm directorsForm : findAll()) {
			remove(directorsForm);
		}
	}

	/**
	 * Returns the number of directors forms.
	 *
	 * @return the number of directors forms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DIRECTORSFORM);

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
		return "directorsFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DIRECTORSFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DirectorsFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the directors form persistence.
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

		DirectorsFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DirectorsFormUtil.setPersistence(null);

		entityCache.removeCache(DirectorsFormImpl.class.getName());
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

	private static final String _SQL_SELECT_DIRECTORSFORM =
		"SELECT directorsForm FROM DirectorsForm directorsForm";

	private static final String _SQL_SELECT_DIRECTORSFORM_WHERE =
		"SELECT directorsForm FROM DirectorsForm directorsForm WHERE ";

	private static final String _SQL_COUNT_DIRECTORSFORM =
		"SELECT COUNT(directorsForm) FROM DirectorsForm directorsForm";

	private static final String _SQL_COUNT_DIRECTORSFORM_WHERE =
		"SELECT COUNT(directorsForm) FROM DirectorsForm directorsForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "directorsForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DirectorsForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DirectorsForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DirectorsFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}